package ru.mirea.task2;

public class Book {
    private String name;
    private int pages;
    public Book(String n, int a){
        name=n;
        pages=a;
    }
    public Book(String n){
        name=n;
        pages=0;
    }
    public Book(int a){
        name="";
        pages=a;
    }
    public void setPages(int pages){
        this.pages=pages;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPages(int pages){
        return pages;
    }
    public String getName(String name){
        return name;
    }
    public String toString(){
        return this.name+" "+this.pages+" pages";
    }
}
