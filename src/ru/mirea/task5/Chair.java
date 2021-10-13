package ru.mirea.task5;

public class Chair extends Furniture{
    protected String name;
    protected int price;
    public Chair(String name, int price) {
        this.type = "chair";
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
