package by.jrr.syntax;

import by.jrr.syntax.calculations.Addition;
import by.jrr.syntax.calculations.Division;
import by.jrr.syntax.calculations.Multiplication;
import by.jrr.syntax.calculations.Subtraction;

public class MathOperationsDemo {

    public static void main(String[] args) {

        System.out.println("Here is demonstration of basic math operations.\n");

        int firstNum = 12;
        int secondNum = 3;

        Addition addition = new Addition();
        Division division = new Division();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();

        System.out.println("Addition result: " + (addition.calculate(firstNum,secondNum)));
        System.out.println("Division result: " + (division.calculate(firstNum,secondNum)));
        System.out.println("Subtraction result: " + (subtraction.calculate(firstNum,secondNum)));
        System.out.println("Multiplication result: " + (multiplication.calculate(firstNum,secondNum)));

    }
}
