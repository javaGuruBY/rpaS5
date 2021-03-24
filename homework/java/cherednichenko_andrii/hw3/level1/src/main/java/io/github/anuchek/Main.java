package io.github.anuchek;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product("Bread", 20,50);
        System.out.println("ActualPrice: " + prod1.actualPrice());
        prod1.printInformation();
    }
}

ww