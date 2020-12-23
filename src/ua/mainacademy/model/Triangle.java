package ua.mainacademy.model;

public class Triangle implements Shape{
    private double side;

    private double base;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return (side * base) / 2;
    }
}
