package ru.mirea.task5;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1= new Husky("husky", 20);
        Dog dog2=new Terrier("terrier", 4);
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
    }
}
