package by.jrr.bean.dogIssue;

public class Dog {
    private int age;
    private String color;
    private String name;

    public Dog() {
    }
    
    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void voice() {
        System.out.println(this.getName() + " barks: \"Bark!\".");
    }
    public void eat() {
        System.out.println(this.getName() + " eats.");
    }
    public void sleep() {
        System.out.println(this.getName() + " sleeps: \"ZzzZzz\".");
    }
}
