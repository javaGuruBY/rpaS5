package by.jrr.bean;

public class ProductDemo {
    public static void productCreation() {
        Product milk = new Product("Milk");
        milk.setRegularPrice(2.80);
        milk.setDiscount(15.0);

        milk.printInformation();
    }
}
