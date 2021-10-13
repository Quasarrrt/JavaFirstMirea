package ru.mirea.task7;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {
        this.width = 0.0;
        this.length = 0.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimeter() {
        return 2.0 * (this.width + this.length);
    }
    @Override
    public String toString() {
        return "Rectangle" + " width: " + this.width + " length: " + this.length + " color: " + this.color + " filled: " + this.filled  + " area: " + this.getArea()  + " perimeter: " + this.getPerimeter() ;
    }
}
