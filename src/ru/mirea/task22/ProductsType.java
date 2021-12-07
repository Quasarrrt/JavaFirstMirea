package ru.mirea.task22;

enum ProductsType {
    Currency, Credit, Deposit, PlasticCards;
}

class EnumProductType {
    public static void main(String[] args) {
        ProductsType dollar;

        dollar = ProductsType.Currency;

        System.out.println("Значение: " + dollar);
        System.out.println();

        dollar = ProductsType.Deposit;

        if (dollar == ProductsType.Deposit) System.out.println("Переменная dollar содержит Deposit.\n");

        switch (dollar) {
            case Currency:
                System.out.println("Валюты");
                break;
            case Credit:
                System.out.println("Кредит");
                break;
            case Deposit:
                System.out.println("Депозит");
                break;
            case PlasticCards:
                System.out.println("Пластиковые карты");
                break;
        }
    }
}