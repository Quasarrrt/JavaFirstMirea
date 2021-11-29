package ru.mirea.task14;

import java.util.Scanner;
import java.util.LinkedList;

public class QueueTest {
    private static final int AMOUNT_OF_CARDS = 5;
    private static final Scanner IN = new Scanner(System.in);
    public static void main(String[] args) {
        var firstPlayerCards = new LinkedList<Integer>();
        var secondPlayerCards = new LinkedList<Integer>();
        System.out.print("Введите карты 1-го игрока: ");
        for (int i = 0; i < AMOUNT_OF_CARDS; ++i) {
            firstPlayerCards.offer(IN.nextInt());
        }
        System.out.print("Введите карты 2-го игрока: ");
        for (int i = 0; i < AMOUNT_OF_CARDS; ++i) {
            secondPlayerCards.offer(IN.nextInt());
        }
        int steps = 0; while (true) {
            if (steps >= 106) { System.out.println();
                System.out.println("botva"); return;
            }
            if (firstPlayerCards.isEmpty())
                break;
            int firstPlayerCard = firstPlayerCards.poll();
            if (secondPlayerCards.isEmpty())
                break;
            int secondPlayerCard = secondPlayerCards.poll();
            if (firstPlayerCard < secondPlayerCard) {
                if (firstPlayerCard == 0 && secondPlayerCard == 9) {
                    firstPlayerCards.offer(firstPlayerCard);
                    firstPlayerCards.offer(secondPlayerCard);
                }
                else {
                    secondPlayerCards.offer(firstPlayerCard);
                    secondPlayerCards.offer(secondPlayerCard);
                }
            }
            else {
                if (firstPlayerCard == 9 && secondPlayerCard == 0) {
                    secondPlayerCards.offer(firstPlayerCard);
                    secondPlayerCards.offer(secondPlayerCard);
                }
                else {
                    firstPlayerCards.offer(firstPlayerCard);
                    firstPlayerCards.offer(secondPlayerCard);
                }
            }
            ++steps;
        }
        String winner = (firstPlayerCards.isEmpty()) ? "second" : "first";
        System.out.println();
        System.out.println(winner + " " + steps);
    }
}