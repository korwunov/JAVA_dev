package ru.mirea.lab41.n1;
import java.math.MathContext;

public class Circle extends Shape{
    private double radius;

    public Circle(int _r) {
        this.radius = _r;
    }

    public String getType() {
        return "Circle";
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2.0);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return this.getType() + "; Area: " + this.getArea() + "; Per: " + this.getPerimeter();
    }
}
