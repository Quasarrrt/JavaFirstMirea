package ru.mirea.task8;

import javax.swing.*;
import java.io.IOException;

public class Gif {
    public static void main(String[] args) throws IOException{
        JFrame frame = new JFrame("GIF");
        frame.setSize(654,654);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        frame.add(panel);
        JLabel label1 = new JLabel(new ImageIcon("D:\\JavaFirstMirea\\src\\ru\\mirea\\task8\\giff.gif"));
        panel.add(label1);
        frame.setVisible(true);
    }
}
