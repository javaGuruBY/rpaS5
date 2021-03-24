package by.jrr.bean;

import java.util.Objects;

public class Product {
    
    private String name;
    private double regularPrice;
    private double discount;

    public Product (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
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

    public double actualPrice() {
        double result = this.regularPrice*(100-this.discount)/100;
        System.out.println(result);
        return result;
    }
    
    public void printInformation() {
        System.out.println("Product : name = \"" + this.getName() + 
                 "\", regular price = " + this.getRegularPrice() + 
                " BYN, discount = " + this.getDiscount() + 
                "%, actual price = " + this.actualPrice() + " BYN");
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.regularPrice, regularPrice) == 0 &&
                Double.compare(product.discount, discount) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regularPrice, discount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", regularPrice=" + regularPrice +
                ", discount=" + discount +
                '}';
    }


}
