package rpg;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color; 
import java.awt.Font; 
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Start {
	

    public static void main(String[] args) {
        JFrame frame = new JFrame("공의모험");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    // 이미지 파일의 경로를 설정
                    Image backgroundImage = ImageIO.read(getClass().getResource("bak.jpg"));
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        // 이미지를 먼저 그린 후 컴포넌트를 그리도록 패널과 버튼을 추가하는 순서 변경
        frame.setContentPane(panel);

        JLabel centerLabel = new JLabel("공의 모험");
        centerLabel.setHorizontalAlignment(JLabel.CENTER);

        // 폰트 색 및 스타일 변경
        centerLabel.setForeground(Color.PINK); // 분홍색
        centerLabel.setFont(new Font("SansSerif", Font.BOLD, 18)); // 폰트 스타일 변경

        JButton topButton = new JButton("게임 시작");
        JButton middleButton = new JButton("게임 로드");
        JButton bottomButton = new JButton("게임 종료");
        
        topButton.setForeground(Color.pink);
        middleButton.setForeground(Color.pink);
        bottomButton.setForeground(Color.pink);
        panel.setLayout(new BorderLayout());
        panel.add(centerLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(topButton);
        buttonPanel.add(middleButton);
        buttonPanel.add(bottomButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        topButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                	
                    String javaPath = System.getProperty("java.home") + "/bin/java";
                    String classpath = System.getProperty("java.class.path");
                    Process process = Runtime.getRuntime().exec(javaPath + " -cp " + classpath + " rpg.Village");
                    System.exit(0);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            	
            }
        });

        frame.setVisible(true);
    }
}

