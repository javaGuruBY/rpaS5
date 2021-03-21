package by.jrr.start;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {

    Stock stock;

    public void createStock(String name, int price){
        this.stock = new Stock(name, price);
    }

    @Test
    public void updatePrice() {
        createStock("Google", 10);
        stock.updatePrice(1);
        stock.updatePrice(4);
        stock.updatePrice(6);
        stock.updatePrice(3);

        int expected = 3;
        int actual = stock.getCurrentPrice();

        assertEquals("updatePrice", expected, actual);
    }

    @Test
    public void updateMinPrice() {
        createStock("Google", 10);

        int expected = 7;
        stock.updatePrice(expected);

        int actual = stock.getMinPrice();

        assertEquals("updateMinPrice", expected, actual);
    }

    @Test
    public void updateMaxPrice() {
        createStock("Google", 10);

        int expected = 15;
        stock.updatePrice(expected);

        int actual = stock.getMaxPrice();

        assertEquals("updateMinPrice", expected, actual);
    }

    @Test
    public void printInformation(){
        createStock("Google", 10);
        stock.printInformation();
    }
}