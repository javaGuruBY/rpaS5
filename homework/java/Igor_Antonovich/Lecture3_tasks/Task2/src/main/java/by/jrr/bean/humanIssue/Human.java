package by.jrr.bean.humanIssue;

public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void greet() {
        System.out.println("Hi! My name is " + this.getName() + ", and i'm " + this.getAge() + " years old.");
    }
}
