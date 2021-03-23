package io.github.anuchek;

public class DogDemo {
    static public void DogFunctionality (){
        Dog dog1 = new Dog(15, "Sirius", "black");

        dog1.eat();
        dog1.sleep();
        dog1.voice();

        System.out.println(dog1.toString());
    }

}
