package ru.mirea.task12;

public class InsertSort {
    public static void main(String[] args) {
        Student[] studs = new Student[5];
        studs[0] = new Student(3, 4.2, "Student 3");
        studs[1] = new Student(2, 5.0, "Student 2");
        studs[2] = new Student(1, 3.0, "Student 1");
        studs[3] = new Student(5, 3.2, "Student 5");
        studs[4] = new Student(4, 2.6, "Student 4");
        System.out.println("Список студентов:");
        for (Student stud : studs) {
            System.out.println(" " + stud.getName());
        }
        insertSort(studs);
        System.out.println("Список студентов:");
        for (Student stud : studs) {
            System.out.println(" " + stud.getName());
        }
    }
    private static void insertSort(Comparable[] array) {
        for (int i = 1; i < array.length; ++i) {
            for (int j = i; j > 0 && less(array[j], array[j - 1]); --j)
            {
                swap(array, j, j - 1);
            }
        }
    }
    private static boolean less(Comparable val1, Comparable val2) {
        return val1.compareTo(val2) < 0;
    }
    private static void swap(Comparable[] array, int i, int j) {
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
