package ru.mirea.task5;

public class Bed extends Furniture{
    protected String name;
    protected int price;
    public Bed(String name, int price) {
        this.type = "bed";
        this.name = name;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
    public String toString() {
        return  type +"'" + name +"'"+ " price " + price;
    }
}
