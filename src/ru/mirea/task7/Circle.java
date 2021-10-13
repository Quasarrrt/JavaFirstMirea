package ru.mirea.task7;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        this.radius=0.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter() {
        return 2.0 * Math.PI * this.radius;
    }
    @Override
    public String toString() {
        return "Circle" + " radius: " + this.radius + " color: " + this.color + " filled: " + this.filled  + " area: " + this.getArea()  + " perimeter: " + this.getPerimeter() ;
    }



}
