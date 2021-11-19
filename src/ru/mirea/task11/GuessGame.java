package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GuessGame extends JFrame
{
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    JButton сonfirm = new JButton("Confirm");
    int tryCount = 3;
    GuessGame() {
        super("Game");
        setLayout(new FlowLayout());
        setSize(300,300);

        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt);

        add(сonfirm);
        сonfirm.setFont(fnt);

        int goal = (int) (Math.random() * 20);

        сonfirm.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                int enteredNum = Integer.parseInt(jta.getText().trim());
                    tryCount--;
                    if (tryCount >= 0)
                        if (enteredNum != goal)
                            if (enteredNum > goal)
                                JOptionPane.showMessageDialog(null, "Загаданное число меньше " +"\n"+
                                        "Осталось попыток: " + tryCount + " ", "Info", JOptionPane.INFORMATION_MESSAGE);
                            else
                                JOptionPane.showMessageDialog(null, "Загаданное число больше " +"\n"+
                                        "Осталось попыток: " + tryCount + " ", "Info", JOptionPane.INFORMATION_MESSAGE);
                        else {
                            JOptionPane.showMessageDialog(null, "Вы угадали число!","Win",JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                            new GuessGame();
                        }
                    else {
                        JOptionPane.showMessageDialog(null, "Число было: " + goal , "Game over", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        new GuessGame();
                    }
            }
        });

        setVisible(true);
    }
    public static void main(String[]args)
    {
        new GuessGame();
    }
}