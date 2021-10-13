package ru.mirea.task10;
public class Task12 {
    public static void isOdd() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println("Это нечетное число: "+n);
                isOdd();
            } else {
                isOdd();
            }
        }
    }
    public static void main(String[] args) {
        isOdd();
    }
}
