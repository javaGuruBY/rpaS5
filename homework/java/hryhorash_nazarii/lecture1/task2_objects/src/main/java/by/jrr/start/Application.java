package by.jrr.start;

import static java.lang.System.*;

public class Application {

    public static void main(String[] args) {
        Human human = new Human();
        Dog dog = new Dog();
        Worm worm = new Worm();
        Cell cell = new Cell();
        Tree tree = new Tree();

        human.say();
        out.println();
        worm.say();
        out.println();
        cell.say();
        out.println();
        tree.say();
    }
}