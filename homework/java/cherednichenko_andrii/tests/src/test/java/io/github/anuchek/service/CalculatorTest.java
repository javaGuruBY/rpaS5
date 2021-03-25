package io.github.anuchek.service;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void testSum(){
        int a = 5;
        int b = 10;
        int expected = 15;

        var calculator = new Calculator();
        int actual = calculator.sum(a, b);

        assertEquals("TestSum" ,expected, actual);

    }
    @Test
    public void testSubs(){
        int a = 5;
        int b = 10;
        int expected = -5;

        var calculator = new Calculator();
        int actual = calculator.subs(a, b);

        assertEquals("TestSubs",expected, actual);

    }
    @Test
    public void testMult(){
        int a = 5;
        int b = 10;
        int expected = 50;

        var calculator = new Calculator();
        int actual = calculator.mult(a, b);

        assertEquals("TestMult", expected, actual);

    }

    private void assertEquals(int expected, int actual, String testSum) throws Exception {
        String testName = testSum;
        boolean testResult = expected == actual;
        if (!testResult){
            throw new Exception(testName + " test passed: " + testResult);
        }
    }
}