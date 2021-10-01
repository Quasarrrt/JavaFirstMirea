package ru.mirea.task1;
import java.util.Arrays;
import java.util.Random;

public class Task1_6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Using random():");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted arr: "+Arrays.toString(arr));

        //2способ Random
        Random random = new Random();
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; ++i) {
            arr2[i] = random.nextInt();
        }
        System.out.println("Using class Random:");
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted arr: "+Arrays.toString(arr2));
    }


}
