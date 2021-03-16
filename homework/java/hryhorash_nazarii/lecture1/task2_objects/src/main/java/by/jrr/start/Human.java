package by.jrr.start;

import static java.lang.System.*;

public class Human extends LivingOrganism{

    private int age = 78;
    private int weight = 65;

    @Override
    public void move() {
        out.println("Move by using legs;");
    }

    @Override
    public void breathe() {
        out.println("Breath with a lungs;");
    }

    @Override
    public void eat() {
        out.println("Has a full digestive system;");
    }

    @Override
    public void reproduction() {
        out.println("Sexual reproduction;");
    }

    @Override
    public void say() {
        out.println("Humans:");
        out.println("Average age " + this.age);
        out.println("Average weight " + this.weight);
        this.move();
        this.breathe();
        this.eat();
        this.reproduction();
    }
}