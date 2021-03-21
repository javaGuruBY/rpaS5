package by.jrr.start;

public class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public  Stock(String name, int price){
        this.companyName = name;
        this.currentPrice = price;
        this.maxPrice = price;
        this.minPrice = price;
    }

    public void updatePrice(int price){

        this.currentPrice = price;

        if (this.minPrice > price)
            this.minPrice = price;
        else if (this.maxPrice < price)
            this.maxPrice = price;
    }

    public void printInformation(){
        System.out.println(" Stocks of " + this.companyName + ": \n" +
                " Current Price = " + this.currentPrice + ", \n" +
                " Min Price = " + this.minPrice + ", \n" +
                " Max Price = " + this.maxPrice + ".");
    }

    public int getMinPrice(){
        return this.minPrice;
    }

    public int getMaxPrice(){
        return this.maxPrice;
    }

    public int getCurrentPrice(){
        return this.currentPrice;
    }

}
