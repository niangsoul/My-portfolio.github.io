package rpg;

import javax.swing.*;
import java.awt.*;

public class interpase extends JPanel {
    private JLabel levelLabel;
    private JLabel healthLabel;
    private JLabel experienceLabel;

    public interpase() {
        setLayout(new GridLayout(3, 2));

        levelLabel = new JLabel("400");
        healthLabel = new JLabel("160000");
        experienceLabel = new JLabel("MAX");
        
        add(new JLabel("Level"));
        add(levelLabel);
        add(new JLabel("Health"));
        add(healthLabel);
        add(new JLabel("Experience"));
        add(experienceLabel);
        
        // 패널의 크기를 조정
        setPreferredSize(new Dimension(300, 200));
    }
    
    public void setLevel(int level) {
    	level = 137;
        levelLabel.setText("" + level);
    }

    public void setHealth(int health) {
    	health = 17750;
        healthLabel.setText("" + health);
    }

    public void setExperience(int experience) {
    	experience = 6287;
        experienceLabel.setText("" + experience);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Character Panel Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        interpase panel = new interpase();
        panel.setLevel(137);
        panel.setHealth(28870);
        panel.setExperience(7726);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

