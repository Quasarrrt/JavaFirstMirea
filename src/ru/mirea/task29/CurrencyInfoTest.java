package ru.mirea.task29;

import java.io.*;
import java.util.List;

public class CurrencyInfoTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        CurrencyInfo currencyInfo = new CurrencyInfo("Euro", "Germany", List.of("business", "workers", "goverments"));

        FileOutputStream outputStream = new FileOutputStream("C:\\Java\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);


        objectOutputStream.writeObject(currencyInfo);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Java\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo currencyInfo1 = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(currencyInfo1);
    }

}
