package by.jrr.start.mytests;

import by.jrr.start.service.Calculator;

public class CalculatorTests {

    public void testSum()  throws Exception {
        int a = 5;
        int b = 10;
        int expected = 15;

        var calculator = new Calculator();
        int actual = calculator.sum(a, b);

        assertEquals(expected, actual, "testSum");
    }

    public void testSubs()  throws Exception {
        int a = 5;
        int b = 10;
        int expected = -5;

        var calculator = new Calculator();
        int actual = calculator.subs(a, b);

        assertEquals(expected, actual, "testSubs");
    }

    public void testMult()  throws Exception {
        int a = 5;
        int b = 10;
        int expected = 50;

        var calculator = new Calculator();
        int actual = calculator.subs(a, b);

        assertEquals(expected, actual, "testMult");
    }

    private void assertEquals(int expected, int actual, String testSubs) throws Exception {
        String testName = testSubs;
        boolean testResult = expected == actual;
        if(!testResult) {
            throw new Exception(testName + " test passed: " + testResult);
        }
    }

}
