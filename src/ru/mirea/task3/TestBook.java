package ru.mirea.task3;

public class TestBook {
        public static void main(String[] args) {
            Book b1 = new Book("Bo", 600);
            Book b2 = new Book("Something");
            b2.setPages(400);
            System.out.println(b1);
            System.out.println(b2);
        }
}
