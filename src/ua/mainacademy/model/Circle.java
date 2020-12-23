package ua.mainacademy.model;

public class Circle implements Shape{
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
