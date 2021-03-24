package by.jrr.start;

public class ProductDemo {

    public static void main(String[] args) {
        Product milk = new Product("Milk");
        milk.setRegularPrice(1);
        milk.setDiscount(20);
        milk.printInformation();
    }
}
