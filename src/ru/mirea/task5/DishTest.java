package ru.mirea.task5;

public class DishTest {
    public static void main(String[] args) {
        Dish glass = new Glass();
        Dish glass1=new Glass("red", 200);
        Dish plate=new Plate("yellow", 400);

        System.out.println(glass.toString());
        System.out.println(glass1.toString());
        System.out.println(plate.toString());

    }

}
