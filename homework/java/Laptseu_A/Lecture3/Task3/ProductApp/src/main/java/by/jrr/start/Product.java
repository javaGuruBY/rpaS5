package by.jrr.start;

public class Product {




    String name;
    double regularPrice;
    double discount;

public double actualPrice(){
return regularPrice*(1-discount/100);
}

    public void printInformation(){

        System.out.println("name = "+name+
                ", regular price = "+regularPrice +""
                 +" EUR, discount = "+discount+
                "%, actual price = "+actualPrice() +" EUR");


    }




    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
