package ru.mirea.task5;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture chair1= new Chair("Herman Miller", 300);
        Furniture chair2= new Chair("DXRacer", 150);
        Furniture bed1= new Bed("IKEA", 500);
        System.out.print("In our furniture shop u can find: \n"+ "1."+chair1.toString()+"\n"+"2."+chair2.toString()+"\n"+"3."+bed1.toString());

    }
}
