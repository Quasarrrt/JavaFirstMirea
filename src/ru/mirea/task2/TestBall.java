package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(40, 6);
        Ball b2 = new Ball(50);
        Ball b3= new Ball(4.5);
        b2.setHeight(66);
        b3.setWeight(4);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
