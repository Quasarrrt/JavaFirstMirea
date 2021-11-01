package ru.mirea.task10;


import java.util.Scanner;

public class Task9 {
    public static int sequence(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return sequence(a, b - 1) + sequence(a - 1, b - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = in.nextInt();
        System.out.println("Input b: ");
        int b = in.nextInt();
        System.out.println( sequence(a, b));
        System.out.println();
    }
}
