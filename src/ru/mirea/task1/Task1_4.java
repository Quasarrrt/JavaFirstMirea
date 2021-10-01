package ru.mirea.task1;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of args: ");
        int n =in.nextInt();
        int[] arr = new int [n];
        System.out.print("Enter args: ");
        for (int i = 0; i<n; i++ ){
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n;i++){
            System.out.print("Args:"+arr[i]+" ");
        }
    }
}

/*public static void main (String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
    }*/