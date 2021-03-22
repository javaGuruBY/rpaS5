package by.jrr.bean.dogIssue;

public class DogDemo {

    public static void getDogs() {
        Dog dog1 = new Dog();
        dog1.setAge(3);
        dog1.setColor("Black");
        dog1.setName("Bony");

        Dog dog2 = new Dog(4, "White", "Clyde");

        System.out.println("Dogs representation: ");
        System.out.println(dog1.getName() + " is " + dog1.getAge() + " and she is" + dog1.getColor());
        System.out.println(dog2.getName() + " is " + dog2.getAge() + " and he is" + dog2.getColor());

        System.out.println("Dogs actions:");
        dog1.voice();
        dog1.eat();
        dog1.sleep();

        dog2.voice();
        dog2.eat();
        dog2.sleep();
    }
}
