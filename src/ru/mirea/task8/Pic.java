package ru.mirea.task8;

import javax.swing.*;
import java.io.IOException;

public class Pic {
    public static void main(String[] args) throws IOException{
        JFrame frame = new JFrame("GIF");
        frame.setSize(900,900);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        frame.add(panel);
        JLabel label1 = new JLabel(new ImageIcon("D:\\JavaFirstMirea\\src\\ru\\mirea\\task8\\pic.jpg"));
        panel.add(label1);
        frame.setVisible(true);
    }
}
