package ru.mirea.task2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape(40, 6);
        Shape s2 = new Shape(50);
        Shape s3= new Shape(4.5);
        s2.setLength(66);
        s3.setWidth(4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
