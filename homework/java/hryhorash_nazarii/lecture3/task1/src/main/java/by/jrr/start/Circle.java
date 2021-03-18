package by.jrr.start;

public class Circle {

    final static double pi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return pi * Math.pow(radius, 2);
    }
}
