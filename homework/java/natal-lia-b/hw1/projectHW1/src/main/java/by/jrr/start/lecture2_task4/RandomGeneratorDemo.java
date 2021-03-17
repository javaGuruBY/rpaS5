package by.jrr.start.lecture2_task4;

import java.util.Random;

/*
Описание:
Разработать программу, которая демонстрирует генерацию случайных чисел, а также различные действия над этими числами.

Функциональные требования:
1. Сгенерировать 3 случайных числа и вывести их на экран.
2. Посчитать сумму этих чисел и вывести результат на экран.

Нефункциональные требования:
1. Класс с демонстрацией должен называться "RandomGeneratorDemo".
2. Генерировать числа можно используя классы "Random" или "Math".

Результат:
Загрузить файл RandomGeneratorDemo.java
*/

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random myRandom = new Random();
        int randomNumber1 = myRandom.nextInt();
        int randomNumber2 = myRandom.nextInt();
        int randomNumber3 = myRandom.nextInt();
        System.out.println(randomNumber1 + " " + randomNumber2 + " " + randomNumber3);

        System.out.println(randomNumber1 + randomNumber2 + randomNumber3);
    }
}
