package rpg;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

public class Village extends JPanel implements ActionListener, KeyListener {
    private int ballX = 0;
    private int ballY = 750;
    private int ballSpeed = 0;
    private Image backgroundImage;
    private Image plotImage;
    private boolean displayPlotImage = false;
    private boolean isJumping = false;

    private int[] rectX = new int[5];
    private int[] rectSpeed = new int[5];
    private int[] rectDirection = new int[5];

    private int attackRadius = 30; // Radius for attack collision detection
    
    int rectWidth = 50;
    int rectHeight = 50;
    int rectGap = 20;
    int rectY = 750;

    public Village() {
        setPreferredSize(new Dimension(1000, 800));
        setFocusable(true);
        addKeyListener(this);

        URL imageURL = getClass().getResource("mk.jpg");
        System.out.println("Resource Path: " + imageURL);

        try {
            if (imageURL != null) {
                backgroundImage = ImageIO.read(imageURL);
            } else {
                System.err.println("Error loading background image. Check the file path and ensure it exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        URL plotImageURL = getClass().getResource("polt.jpg");
        try {
            if (plotImageURL != null) {
                plotImage = ImageIO.read(plotImageURL);
            } else {
                System.err.println("Error loading plot image. Check the file path and ensure it exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            rectX[i] = 950 + i * 70;
            rectSpeed[i] = random.nextInt(5) + 1;
            rectDirection[i] = (Math.random() < 0.5) ? 1 : -1;
        }

        Timer timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (ballSpeed != 0) {
            ballX += ballSpeed;
            if (ballX < 0) {
                ballX = 0;
            } else if (ballX > 950) {
                ballX = 950;
            }

            for (int i = 0; i < 5; i++) {
                rectX[i] += rectSpeed[i] * rectDirection[i];
                if (rectX[i] < -70 || rectX[i] > 950) {
                    rectDirection[i] = -rectDirection[i];
                }
            }

            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (displayPlotImage && plotImage != null) {
            g.drawImage(plotImage, 0, 0, getWidth(), getHeight(), this);
        } else if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        } else {
            System.err.println("Background image is null. Make sure it is loaded successfully.");
        }

        g.setColor(Color.BLUE);


        for (int i = 0; i < 5; i++) {
            g.fillRect(rectX[i], rectY, rectWidth, rectHeight);
        }

        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, 50, 50);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_D) {
            ballSpeed = 5;
        } else if (key == KeyEvent.VK_A) {
            ballSpeed = -5;
        } else if (key == KeyEvent.VK_C) {
            System.out.println("Key 'C' pressed. Add your code here.");

            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Interface");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(new interpase());
                frame.pack();
                frame.setVisible(true);
            });
        } else if (key == KeyEvent.VK_P) {
            displayPlotImage = !displayPlotImage;
            repaint();
        } else if (key == KeyEvent.VK_W && ballX == 950 && ballY == 750) {
            System.out.println("Executing stage1.java. Add your code here.");

            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Village");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(new stage1());
                frame.pack();
                frame.setVisible(true);

                SwingUtilities.getWindowAncestor(this).dispose();
            });
        } else if (key == KeyEvent.VK_K && !isJumping) {
            isJumping = true;
            jump();
        } else if (key == KeyEvent.VK_J) {
            // Attack with 'J' key
            performAttack();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_K) {
            isJumping = false;
        }
        ballSpeed = 0;
    }

    private void jump() {
        Thread jumpThread = new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                ballY -= 5;
                repaint();
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 30; i++) {
                ballY += 5;
                repaint();
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            isJumping = false;
        });
        jumpThread.start();
    }

    private void performAttack() {
        // Check for collision with rectangles
        for (int i = 0; i < 5; i++) {
            if (ballX + attackRadius > rectX[i] && ballX < rectX[i] + rectWidth
                    && ballY + attackRadius > rectY && ballY < rectY + rectHeight) {
                // Collision occurred, remove the rectangle
                rectX[i] = -100; // Move the rectangle off-screen
                repaint(); // Repaint to immediately reflect the changes
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("초원 지대");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new Village());
            frame.pack();
            frame.setVisible(true);
        });
    }
}