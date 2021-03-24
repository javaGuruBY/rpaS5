package io.github.anuchek;

public class Dog {
    int age;
    String name;
    String color;

    public void voice(){
        System.out.println("bark bark");
    }
    public void eat() {
        System.out.println("give me food homan");
    }
    public void sleep(){
        System.out.println("Dont touch m next nine hours..ZZZ");
    }

    public Dog(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "I`m a Dog. " + "My age equals to " + age
                + ", my name is " + name
                + ", and my owner colored me in "
                + color + " color";
    }
}
