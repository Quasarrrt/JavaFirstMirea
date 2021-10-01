package ru.mirea.task1;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of args for array: ");
        int n =in.nextInt();
        int[] arr = new int [n];
        System.out.print("Enter args: ");
        for (int i = 0; i<n; i++ ){
            arr[i] = in.nextInt();
        }
        //for
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum= "+sum);
        //while
        int c = 0;
        sum = 0;
        while (c < arr.length) {
            sum += arr[c++];
        }
        System.out.println("Sum= "+sum);
        //do while
        sum = 0;
        c = 0;
        do {
            sum += arr[c++];
        } while (c < arr.length);
        System.out.println("Sum= "+sum);
    }
}
