package _10_Swing;

import javax.swing.*;
import java.awt.*;

public class Okno4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setTitle("Nasze drugie okno");

        JLabel label = new JLabel("Hello World!!!!!!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        label.setForeground(Color.RED);

        Color kolorTla = new Color(0xFFFF90);

        label.setOpaque(true);
        label.setBackground(kolorTla);

        frame.add(label);


        JButton button = new JButton("OK");
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        frame.add(button);
       //  frame.add(button, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}

