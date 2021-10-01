package ru.mirea.task2;

public class Ball {
    private double height;
    private int weight;
    public Ball(double a, int b){
        height=a;
        weight=b;
    }
    public Ball(double a){
        height=a;
        weight=0;
    }
    public Ball(int b){
        height=0;
        weight=b;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public double getHeight(double height){
        return height;
    }
    public int getWeight(int weight){
        return weight;
    }
    public String toString(){
        return "Ball is "+this.height+"cm and "+this.weight+"kg";
    }
}
