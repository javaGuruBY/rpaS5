package by.jrr.start;

import static java.lang.System.*;

public class Worm extends LivingOrganism{

    private int age = 2;
    private double weight = 0.1;

    @Override
    public void move() {
        out.println("Move by using body muscles;");
    }

    @Override
    public void breathe() {
        out.println("Breath with a skin;");
    }

    @Override
    public void eat() {
        out.println("Has a small simple digestive system;");
    }

    @Override
    public void reproduction() {
        out.println("They are hermaphrodites");
    }

    @Override
    public void say() {
        out.println("Worms:");
        out.println("Average age " + this.age);
        out.println("Average weight " + this.weight);
        this.move();
        this.breathe();
        this.eat();
        this.reproduction();
    }
}