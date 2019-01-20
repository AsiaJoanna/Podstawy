package _10_Swing;

import javax.swing.*;

public class Okno2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setTitle("Nasze drugie okno");
        frame.setVisible(true);
        JLabel label = new JLabel("Hello World!!!");
        frame.add(label);
    }
}
