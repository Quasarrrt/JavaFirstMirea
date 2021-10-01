package ru.mirea.task3;

public class TestHuman {
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println(h);
        h.setHeadEyes("grey");
        System.out.println(h);
        h.setLegSize(40);
        System.out.println(h);
        h.setHand(70, 45);
        System.out.println(h);
    }
}
