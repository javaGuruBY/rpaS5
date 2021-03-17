package by.jrr.start.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum()  throws Exception {
        int a = 5;
        int b = 10;
        int expected = 15;

        var calculator = new Calculator();
        int actual = calculator.sum(a, b);

        assertEquals("testSum", expected, actual);
    }

    @Test
    public void testSubs()  throws Exception {
        int a = 5;
        int b = 10;
        int expected = -5;

        var calculator = new Calculator();
        int actual = calculator.subs(a, b);

        assertEquals( "testSubs", expected, actual);
    }

    @Test
    public void testMult()  throws Exception {
        int a = 5;
        int b = 10;
        int expected = 50;

        var calculator = new Calculator();
        int actual = calculator.subs(a, b);

        assertEquals( "testMult", expected, actual);
    }

}
