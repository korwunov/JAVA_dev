package ru.mirea.lab41.n8;

public class Circle extends Shape{
    protected double radius;

    public Circle() {}

    public Circle (double radius) { this.radius = radius; }

    public Circle( double radius, String color, boolean filled ) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: Area = " + this.getArea() + "; Perimeter = " + this.getPerimeter();
    }
}
