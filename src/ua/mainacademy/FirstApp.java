package ua.mainacademy;

import ua.mainacademy.model.Circle;
import ua.mainacademy.model.Square;
import ua.mainacademy.model.Triangle;

public class FirstApp {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println("Circle area with radius " + circle.getRadius() + " is " + circle.getArea());

        Triangle tringle = new Triangle();
        tringle.setBase(15);
        tringle.setSide(10);
        System.out.println("Triangle area with base " + tringle.getBase() + " and side " + tringle.getSide() + " is " + tringle.getArea());

        Square square = new Square();
        square.setSide(20);
        System.out.println("Square area with side " + square.getSide() + " is " + square.getArea());

    }
}
