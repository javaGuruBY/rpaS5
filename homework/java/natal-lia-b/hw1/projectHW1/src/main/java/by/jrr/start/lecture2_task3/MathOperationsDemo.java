package by.jrr.start.lecture2_task3;
/*
Описание:
Разработать программу, которая демонстрирует работу с простейшими математическими операциями.

Функциональные требования:
1. Продемонстрировать работу с операциями сложения, вычитания, умножения и деления, и вывести результат вычислений на экран.

Нефункциональные требования:
1. Класс с демонстрацией должен называться "MathOperationsDemo".

Результат:
Загрузить файл MathOperationsDemo.java
*/

public class MathOperationsDemo {
    public static void main(String[] args) {
        new Addition(10, 2);
        new Addition(10.0, 2.0);
        new Subtraction(10, 2);
        new Subtraction(10.0, 2.0);
        new Multiplication(10, 2);
        new Multiplication(10.0, 2.0);
        new Division(10, 3);
        new Division(10.0, 3);
        new Mod(11, 2);
        new Mod(11.0, 2.0);
    }
}
