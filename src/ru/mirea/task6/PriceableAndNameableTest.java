package ru.mirea.task6;

public class PriceableAndNameableTest {
    public static void main(String[] args) {
    Computer pc= new Computer(100, 200, 400, "ASUS");
    System.out.println(pc.getPrice());
    System.out.println(pc.getName());
    Chocolate chocolate=new Chocolate(100, 2, "Lindt");
    System.out.println(chocolate.getPrice());
    System.out.println(chocolate.getName());
    }
}
