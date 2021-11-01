package ru.mirea.task8.task1;

import java.awt.*;
public class Square extends Shape
{
    protected int side;
    public Square(int x, int y, int side, Color color)
    {
        this.side = side;
        this.color = color;
        this.point = new Point(x,y);
    }
    public int getSide()
    {
        return side;
    }
    public double getX()
    {
        return point.getX();
    }
    public double getY()
    {
        return point.getY();
    }
    @Override
    public Color getColor()
    {
        return color;
    }
}