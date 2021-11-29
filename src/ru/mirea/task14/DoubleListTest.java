package ru.mirea.task14;

import java.util.LinkedList;
import java.util.Scanner;

public class DoubleListTest {
    private static final int AMOUNT_OF_CARDS = 5;
    private static final Scanner IN = new Scanner(System.in);
    public static void main(String[] args) {
        var firstPlayerCards = new LinkedList<Integer>();
        var secondPlayerCards = new LinkedList<Integer>();
        System.out.print("Введите карты 1-го игрока: ");
        for (int i = 0; i < AMOUNT_OF_CARDS; ++i) {
            firstPlayerCards.add(IN.nextInt());
        }
        System.out.print("Введите карты 2-го игрока: ");
        for (int i = 0; i < AMOUNT_OF_CARDS; ++i) {
            secondPlayerCards.add(IN.nextInt());
        }
        int steps = 0; while (true) {
            if (steps >= 106) { System.out.println();
                System.out.println("botva"); return;
            }
            if (firstPlayerCards.isEmpty())
                break;
            int firstPlayerCard = firstPlayerCards.remove();
            if (secondPlayerCards.isEmpty())
                break;
            int secondPlayerCard = secondPlayerCards.remove();
            if (firstPlayerCard < secondPlayerCard) {
                if (firstPlayerCard == 0 && secondPlayerCard == 9) {
                    firstPlayerCards.add(firstPlayerCard);
                    firstPlayerCards.add(secondPlayerCard);
                }
                else {
                    secondPlayerCards.add(firstPlayerCard);
                    secondPlayerCards.add(secondPlayerCard);
                }
            }
            else {
                if (firstPlayerCard == 9 && secondPlayerCard == 0) {
                    secondPlayerCards.add(firstPlayerCard);
                    secondPlayerCards.add(secondPlayerCard);
                }
                else {
                    firstPlayerCards.add(firstPlayerCard);
                    firstPlayerCards.add(secondPlayerCard);
                }
            }
            ++steps;
        }
        String winner = (firstPlayerCards.isEmpty()) ? "second" : "first";
        System.out.println();
        System.out.println(winner + " " + steps);
    }
}
