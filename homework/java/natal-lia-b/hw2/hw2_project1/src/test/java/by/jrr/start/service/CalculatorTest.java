package by.jrr.start.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testSum() throws Exception{
        int a = 5;
        int b = 10;
        int expected = 15;

        Calculator calculator = new Calculator();
        int actual = calculator.sum(a, b);

        assertEquals("testSum", expected, actual);
    }

    @Test
    public void testSubtraction() throws Exception{
        int a = 5;
        int b = 10;
        int expected = -5;

        Calculator calculator = new Calculator();
        int actual = calculator.subtraction(a, b);

        assertEquals("testSubtraction", expected, actual);
    }

    @Test
    public void testMult() throws Exception{
        int a = 5;
        int b = 10;
        int expected = 50;

        Calculator calculator = new Calculator();
        int actual = calculator.mult(a, b);

        assertEquals("testMult", expected, actual);
    }
}