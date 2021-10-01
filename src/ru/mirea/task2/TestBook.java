package ru.mirea.task2;
import ru.mirea.task3.Book;

public class TestBook {
    public static void main(String[] args) {
        ru.mirea.task3.Book b1 = new ru.mirea.task3.Book("Bo", 600);
        ru.mirea.task3.Book b2 = new Book("Something");
        b2.setPages(400);
        System.out.println(b1);
        System.out.println(b2);
    }
}
