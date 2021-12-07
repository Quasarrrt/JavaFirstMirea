package ru.mirea.task22;

import java.util.Scanner;


public class Factory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductsType product;
        System.out.println("Выберите один из банковских услуг");
        System.out.println("1 - Кредит");
        System.out.println("2 - Пластиковые карты");
        System.out.println("3 - Валюты");
        System.out.println("4 - Депозит");
        int n = scanner.nextInt();
        product = switch (n){
            case 1 -> ProductsType.Credit;
            case 2 -> ProductsType.PlasticCards;
            case 3 -> ProductsType.Currency;
            case 4 -> ProductsType.Deposit;
            default -> null;
        };
        System.out.println(product);
    }
}
