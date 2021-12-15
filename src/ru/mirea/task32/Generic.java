package ru.mirea.task32;

import java.util.ArrayList;
import java.util.Date;

public class Generic {
    static ArrayList<Product> products = new ArrayList<>();

    static public void printList(ArrayList<Product> products) {
        for(int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getAccountID());
        }
    }
    public static void main(String[] args) {
        Date openDate = new Date();
        Product product1 = new Product(31231231, ProductsType.Currency, openDate, openDate, 413);
        products.add(product1);
        Product product2 = new Product();
        products.add(product2);
        printList(products);
    }
}
