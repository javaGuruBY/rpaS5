package by.jrr.start;

import java.util.Random;
import java.util.Scanner;

public class RandomGeneratorDemo {

    public static void main(String[] args) {

        Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);

        System.out.print(num1 + " + " + num2 + " = ");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == num1 + num2)
            System.out.println(" You are right! =)");
        else
            System.out.println(" You are incorrect! =(");

        System.out.print(num1 + " * " + num2 + " = ");

        answer = input.nextInt();
        if (answer == num1 * num2)
            System.out.println(" You are right! =)");
        else
            System.out.println(" You are incorrect! =(");
    }
}
