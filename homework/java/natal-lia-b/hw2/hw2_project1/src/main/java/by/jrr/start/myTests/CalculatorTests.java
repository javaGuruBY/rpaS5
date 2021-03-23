package by.jrr.start.myTests;

import by.jrr.start.service.Calculator;

public class CalculatorTests {
    public void testSum() throws Exception{
        int a = 5;
        int b = 10;
        int expected = 15;

        Calculator calculator = new Calculator();
        int actual = calculator.sum(a, b);

        assertEquals(expected, actual, "testSum");
    }

    public void testSubtraction() throws Exception{
        int a = 5;
        int b = 10;
        int expected = -5;

        Calculator calculator = new Calculator();
        int actual = calculator.subtraction(a, b);

        assertEquals(expected, actual, "testSubtraction");
    }

    public void testMult() throws Exception{
        int a = 5;
        int b = 10;
        int expected = 50;

        Calculator calculator = new Calculator();
        int actual = calculator.mult(a, b);

        assertEquals(expected, actual, "testMult");
    }

    private void assertEquals(int expected, int actual, String testName) throws Exception {
        boolean testResult = expected == actual;
        if (!testResult) {
            throw new Exception(testName + "test passed = " + testResult);
        }
    }
}
