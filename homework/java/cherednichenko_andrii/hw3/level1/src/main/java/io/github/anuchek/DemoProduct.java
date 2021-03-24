package io.github.anuchek;

public class DemoProduct {
    static public void demonstraition(){
        Product prod1 = new Product("Bread", 20,50);
        System.out.println("ActualPrice: " + prod1.actualPrice());
        prod1.printInformation();
    }
}
