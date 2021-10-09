package ru.mirea.task6;

public class Chocolate implements Priceable,Nameable{
    private String name;
    private int weight;
    private int type;
    public void setName(String name){
        this.name=name;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getWeight(){
        return weight;
    }
    public void setType(int type){
        this.type=type;
    }
    public int getType(){
        return type;
    }
    public Chocolate(int weight, int type, String name){
        this.weight=weight;
        this.type=type;
        this.name=name;
    }
    @Override
    public int getPrice(){
        return type*weight;
    }
    @Override
    public String getName(){
        return name;
    }

}
