package by.jrr.start;

public class Circle {

    private double R;

    public Circle(double r) {
        if (r>0) R = r;
        else return;

    }

    public double calculateArea(){
        return Math.pow((Math.PI*R),2);
    }


}
