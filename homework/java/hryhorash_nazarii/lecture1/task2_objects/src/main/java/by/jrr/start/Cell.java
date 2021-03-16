package by.jrr.start;

import static java.lang.System.*;

public class Cell extends LivingOrganism{

    private int age = 1;
    private double weight = 0.0001;

    @Override
    public void move() {
        out.println("Mostly do not move;");
    }

    @Override
    public void breathe() {
        out.println("Breath with a shell;");
    }

    @Override
    public void eat() {
        out.println("Has no digestive system, they try to catch elements with a shell;");
    }

    @Override
    public void reproduction() {
        out.println("Mostly divide reproduction;");
    }

    @Override
    public void say() {
        out.println("Cells:");
        out.println("Average age " + this.age + " day");
        out.println("Average weight " + this.weight);
        this.move();
        this.breathe();
        this.eat();
        this.reproduction();
    }
}
