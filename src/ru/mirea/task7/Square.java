package ru.mirea.task7;

public class Square extends Rectangle {
    public Square() {
        this.width = 0.0;
        this.length = 0.0;
    }
    public Square(double side) {
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return this.width;
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }
    @Override
    public void setLength(double length) {
        this.setSide(length);
    }
    @Override
    public String toString() {
       return "Square" + " width: " + this.width + " length: " + this.length + " color: " + this.color + " filled: " + this.filled  + " area: " + this.getArea()  + " perimeter: " + this.getPerimeter() ;
    }
}

