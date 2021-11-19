package ru.mirea.task11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WelcomeTo {
    static class Cities extends JFrame {
        BorderLayout lay = new BorderLayout();
        JLabel north = new JLabel("NORTH", SwingConstants.CENTER);
        JLabel east = new JLabel("EAST", SwingConstants.CENTER);
        JLabel west = new JLabel("WEST", SwingConstants.CENTER);
        JLabel south = new JLabel("SOUTH", SwingConstants.CENTER);
        JLabel center = new JLabel("CENTER", SwingConstants.CENTER);
        private JDialog dialog = null;
        private JLabel dialogLabel;

        public Cities() {
            super("Welcome");
            setSize(500, 500);
            add(north, BorderLayout.NORTH);
            add(east, lay.EAST);
            add(west, lay.WEST);
            add(south, lay.SOUTH);
            add(center, lay.CENTER);

            north.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    showCity("Добро пожаловать в Осло!");
                }
            });

            center.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    showCity("Добро пожаловать в Москва!");
                }
            });

            west.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    showCity("Добро пожаловать в Лондон!");
                }
            });

            east.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    showCity("Добро пожаловать в Пекин!");
                }
            });

            south.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    showCity("Добро пожаловать в Милан!");
                }
            });

            setVisible(true);
        }

        private void showCity(String s) {
            if (dialog == null) {
                dialog = new JDialog();
                dialog.setModalityType(Dialog.ModalityType.MODELESS);
                dialogLabel = new JLabel(s);
                dialog.add(dialogLabel, BorderLayout.CENTER);

                dialog.pack();
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
            dialogLabel.setText(s);
        }
    }
    public static void main(String[] args) {
        new Cities();
    }
}

