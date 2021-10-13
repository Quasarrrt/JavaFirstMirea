package ru.mirea.task5;

public abstract class Dish {
    protected String color;
    protected int price;
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return "color= "+ color+",price="+ price;
    }

}
