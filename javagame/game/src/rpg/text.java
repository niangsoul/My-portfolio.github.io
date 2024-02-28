package rpg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class text extends JFrame {
    private static final int SQUARE_SIZE = 100;
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 200;

    private int squareX;
    private int squareSpeed;

    public text() {
        setTitle("Moving Square");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        squareX = 0;
        squareSpeed = 5;

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveSquare();
                repaint();
            }
        });
        timer.start();
    }

    private void moveSquare() {
        // Move the square left or right randomly
        int direction = Math.random() < 0.5 ? -1 : 1;
        squareX += direction * squareSpeed;

        // Reverse direction if the square hits the frame boundaries
        if (squareX < 0 || squareX > FRAME_WIDTH - SQUARE_SIZE) {
            squareSpeed *= -1;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(squareX, FRAME_HEIGHT / 2 - SQUARE_SIZE / 2, SQUARE_SIZE, SQUARE_SIZE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                text movingSquare = new text();
                movingSquare.setVisible(true);
            }
        });
    }
}
