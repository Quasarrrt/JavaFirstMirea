package ru.mirea.task1;

import java.util.Scanner;

public class Task1_7 {
    public static void factorial(int n){
        int f = 1;
        for (int i = 1; i<=n;i++){
            f = f*i;
        }
        System.out.println("Factorial" +" "+n+": "+f);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = in.nextInt();
        factorial(num);
    }

}
