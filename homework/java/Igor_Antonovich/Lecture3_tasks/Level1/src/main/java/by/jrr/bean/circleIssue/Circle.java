package by.jrr.bean.circleIssue;

import java.util.Objects;

public class Circle {

    private double radius;
    
    public double getRadius() { 
        return radius;
    }

    public Circle(double rad) {
        this.radius = rad;
    }

    public double calculateArea() {
        return Math.PI*Math.pow(this.getRadius(),this.getRadius());
    }


    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" + 
                "radius='" + radius + '}';
    }

}
