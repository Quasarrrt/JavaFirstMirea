package ru.mirea.task10;

import java.util.Scanner;

public class Task8 {
    public static String isPalindrom(String s) {
        if (s.length() == 1) {
            return "YES";
        }
        else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return isPalindrom(s.substring(1, s.length() - 1));
            }
            else {
                return "NO";
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.println(isPalindrom(word));
    }
}
