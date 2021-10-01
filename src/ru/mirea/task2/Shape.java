package ru.mirea.task2;

public class Shape {
    private double length;
    private int width;
    public Shape(double a, int b){
        length=a;
        width=b;
    }
    public Shape(double a){
        length=a;
        width=0;
    }
    public Shape(int b){
        length=0;
        width=b;
    }
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public double getLength(double length){
        return length;
    }
    public int getWidth(int width){
        return width;
    }
    public String toString(){
        return "Length "+this.length+"cm and width "+this.width+"cm";
    }
}
