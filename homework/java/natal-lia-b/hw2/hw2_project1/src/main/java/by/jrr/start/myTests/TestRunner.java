package by.jrr.start.myTests;

public class TestRunner {
    static int totalTests = 0;
    static int testPassed = 0;
    static int testsFailed = 0;

    public static void runTest() throws Exception{
        CalculatorTests calculatorTests = new CalculatorTests();
        try {
            totalTests++;
            calculatorTests.testSum();
            testPassed++;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            testsFailed++;
        }

        try {
            totalTests++;
            calculatorTests.testSubtraction();
            testPassed++;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            testsFailed++;
        }

        try {
            totalTests++;
            calculatorTests.testMult();
            testPassed++;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            testsFailed++;
        }

        System.out.println("totalTests = " + totalTests);
        System.out.println("testPassed = " + testPassed);
        System.out.println("testsFailed = " + testsFailed);
        if (testsFailed > 0) {
            throw new Exception("test Failed");
        }
    }
}
