package by.jrr.start;

import java.util.Scanner;

public class MathOperationsDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double num_1 = in.nextDouble();
        char action = in.next().charAt(0);
        double num_2 = in.nextDouble();
        switch(action) {
            case '*':
                System.out.print(num_1 + " * " + num_2 + " = ");
                System.out.printf("%.5f", num_1 * num_2);
                break;
            case '+':
                System.out.print(num_1 + " + " + num_2 + " = ");
                System.out.printf("%.5f", num_1 + num_2);
                break;
            case '-':
                System.out.print(num_1 + " - " + num_2 + " = ");
                System.out.printf("%.5f", num_1 - num_2);
                break;
            case '/':
                System.out.print(num_1 + " / " + num_2 + " = ");
                System.out.printf("%.5f", num_1 / num_2);
                break;
            case '^':
                System.out.print(num_1 + " ^ " + num_2 + " = ");
                System.out.printf("%.5f", Math.pow(num_1, num_2));
                break;
            default:
                System.out.println("!Error! \nTry again ");
        }
    }

}
