package by.jrr.syntax;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args) {

        System.out.println("Random nums generation demonstration.\n");

        int firstNum;
        int secondNum;
        int thirdNum;
        int bound;

        bound = 30;

        Addition addition = new Addition();
        Random random = new Random();

        firstNum = random.nextInt(bound);
        secondNum = random.nextInt(bound);
        thirdNum = random.nextInt(bound);

        System.out.println("First random num: " + firstNum);
        System.out.println("Second random num: " + secondNum);
        System.out.println("Third random num: " + thirdNum);

        System.out.println("Random nums sum: " + addition.calculation(firstNum,secondNum,thirdNum));




    }
}
