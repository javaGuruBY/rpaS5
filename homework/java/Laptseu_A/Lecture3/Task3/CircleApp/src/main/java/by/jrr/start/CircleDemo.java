package by.jrr.start;

public class CircleDemo {

    public static void main(String[] args) {

        Circle R3 = new Circle(3);
        Circle R0 = new Circle(0);
        Circle R40 = new Circle(40);
        Circle R90 = new Circle(90);
        Circle R_MINUS_90 = new Circle(-90);


        System.out.println(R3.calculateArea());
        System.out.println(R0.calculateArea());
        System.out.println(R40.calculateArea());
        System.out.println(R90.calculateArea());
        System.out.println(R_MINUS_90.calculateArea());












    }
}
