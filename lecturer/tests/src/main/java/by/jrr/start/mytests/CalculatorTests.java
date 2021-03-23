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
        int actual = calculator.mult(a, b);

        assertEquals(expected, actual, "testMult");
    }

    public void testDiv()  throws Exception {
        int a = 5;
        int b = 10;
        double expected = 0.5;

        var calculator = new Calculator();
        double actual = calculator.div(a, b);

        String testName = "testDiv";
        boolean testResult = expected == actual;
        System.out.println(testName + " testPassed: " + testResult);

    }

    private void assertEquals(int expected, int actual, String testSubs) throws Exception {
        String testName = testSubs;
        boolean testResult = expected == actual;
        if(!testResult) {
            throw new Exception(testName + " test passed: " + testResult);
        }
    }

}
