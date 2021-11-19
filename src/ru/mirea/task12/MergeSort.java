package ru.mirea.task12;

import java.util.Scanner;

public class MergeSort {
    private static final Scanner IN = new Scanner(System.in);
    private static String[] helper;
    public static void main(String[] args) {
        String[] list1 = new String[5];
        String[] list2 = new String[5];
        System.out.print("Введите 5 имён студентов: ");
        for (int i = 0; i < list1.length; ++i) {
            list1[i] = IN.next();
        }
        System.out.print("Введите ещё 5 имён студентов: ");
        for (int i = 0; i < list2.length; ++i) {
            list2[i] = IN.next();
        }
        String[] list = new String[list1.length + list2.length];
        System.arraycopy(list1, 0, list, 0, list1.length);
        System.arraycopy(list2, 0, list, list1.length, list2.length);
        sort(list);
        System.out.println();
        System.out.println("Список студентов:");
        for (String stud : list) {
            System.out.println("	" + stud);
        }
    }
    private static boolean less(String val1, String val2) {
        return val1.compareTo(val2) < 0;
    }
    private static void merge(String[] array, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        helper = array.clone();
        for (int k = low; k <= high; ++k) {
            if (i > mid) {
                array[k] = helper[j++];
            }
            else if (j > high) {
                array[k] = helper[i++];
            }
            else if (less(helper[j], helper[i])) {
                array[k] = helper[j++];
            }
            else {
                array[k] = helper[i++];
            }
        }
    }

    private static void sort(String[] array) {
        helper = new String[array.length];
        sort(array, 0, array.length - 1);
    }

    private static void sort(String[] array, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        merge(array, low, mid, high);
    }
}
