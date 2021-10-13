package ru.mirea.task5;

public abstract class Furniture {
    protected String type;
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public String toString(){
        return "Type is "+type;
    }
    public abstract int getPrice();
    public abstract String getName();
}
