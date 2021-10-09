package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Нужна ли кнопка для конца матча и отдельная обработка этой логики???
public class FootballMatch {
    private static int bScore=0;
    private static int rScore=0;
    private static JLabel result;
    private static JLabel lastScorer;
    private static Label winner;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Barcelona vs Real Madrid");

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         result = new JLabel("Result: 0 X 0");
         lastScorer = new JLabel("Last Scorer: N/A");
        winner = new Label("Winner: DRAW");

        result.setHorizontalAlignment(JLabel.CENTER);
        lastScorer.setHorizontalAlignment(JLabel.CENTER);
        winner.setAlignment(Label.CENTER);

         String bName="Barcelona";
         String rName="Real Madrid";

        JButton team1 = new JButton(bName);
        JButton team2 = new JButton(rName);
        team1.setSize(50,50);
        team2.setSize(50,50);


        team1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bScore++;
                lastScorer.setText("Last Scorer: "+bName);
                changeRes(bScore, rScore);
            }});

        team2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rScore++;
                lastScorer.setText("Last Scorer: "+rName);
                changeRes(bScore, rScore);
            }});

        frame.add(team1, BorderLayout.WEST);
        frame.add(team2, BorderLayout.EAST);
        frame.add(result, BorderLayout.NORTH);
        frame.add(lastScorer, BorderLayout.SOUTH);
        frame.add(winner, BorderLayout.CENTER);
    }

    private static void changeRes(int bS, int rS){
        result.setText("Result: " +bS+" X "+rS);
        winner.setText("Winner: " + ((bS > rS) ? "AC Milan" : (bS == rS) ? "DRAW" : "Real Madrid"));
    };


}
