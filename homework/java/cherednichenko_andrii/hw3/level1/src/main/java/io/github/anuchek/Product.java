package io.github.anuchek;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;  //%

    public double actualPrice(){
        return regularPrice - (regularPrice/100)*discount;
    }

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public void printInformation(){
        System.out.println("name: \"" + name
                + "\",regular Price = " + regularPrice
                + " EUR, dicount = " + discount
                + "%" + ", actual price = " + actualPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
