package by.jrr.bean.humanIssue;

public class HumanDemo {
    public static void getHuman() {

        Human human = new Human("Jack", 25);

        System.out.println("Hi! My name is " + human.getName() + ", and i'm " + human.getAge() + " years old.");
    }
}
