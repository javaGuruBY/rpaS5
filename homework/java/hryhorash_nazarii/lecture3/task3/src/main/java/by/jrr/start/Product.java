package by.jrr.start;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name, double regularPrice, double  discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice(){
        double realDiscount = this.regularPrice * this.discount / 100;
        return this.regularPrice - realDiscount;
    }

    void printInformation(){
        System.out.println("Product : name = " + this.name + ". \n" +
                "          regular price = " + this.regularPrice + ". \n" +
                "          discount = " + this.discount + "%. \n" +
                "          actual price = " + this.actualPrice() + " EUR");
    }
}
