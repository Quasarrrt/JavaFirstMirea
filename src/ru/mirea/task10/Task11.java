package ru.mirea.task10;

import java.util.Scanner;

public class Task11 {
    public static int one() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 00)
            return 0;
        if (n == 1)
            return one() + 1;
        else
            return one();
    }
    public static void main(String[] args) {
        System.out.println("Всего единиц тут: "+one());
    }
}
