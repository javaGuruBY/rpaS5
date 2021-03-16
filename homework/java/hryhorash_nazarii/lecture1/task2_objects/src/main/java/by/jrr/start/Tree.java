package by.jrr.start;

import static java.lang.System.*;

public class Tree extends LivingOrganism{

    private int age = 100;
    private double weight = 1000;

    @Override
    public void move() {
        out.println("Do not move;");
    }

    @Override
    public void breathe() {
        out.println("Breath with by photosynthesis;");
    }

    @Override
    public void eat() {
        out.println("Make elements by using photosynthesis;");
    }

    @Override
    public void reproduction() {
        out.println("Mostly with seeds;");
    }

    @Override
    public void say() {
        out.println("Trees:");
        out.println("Average age " + this.age + "+");
        out.println("Average weight " + this.weight);
        this.move();
        this.breathe();
        this.eat();
        this.reproduction();
    }
}