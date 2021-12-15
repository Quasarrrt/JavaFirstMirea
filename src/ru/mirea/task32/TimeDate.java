package ru.mirea.task32;

import java.util.Date;

public class TimeDate {
    public static void main(String[] args){
        Product credit = new Product();
        Date openDate = new Date();
        credit.setOpenDate(openDate);

        System.out.println(openDate);
        System.out.println("Дата открытия " + credit.getProductType() +" " +credit.getOpenDate());
    }
}
