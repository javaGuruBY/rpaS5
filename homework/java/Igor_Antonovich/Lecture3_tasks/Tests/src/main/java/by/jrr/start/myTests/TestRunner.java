package by.jrr.start.myTests;

public class TestRunner {

    static int totalTests = 0;
    static int testsPast = 0;
    static int testsFailed = 0;

    public static void runTest() throws Exception{

        var calculatorTests = new CalculatorTests();
        try {
            totalTests++;
            calculatorTests.testSum();
            testsPast++;
        } catch (Exception ex) {
            testsFailed++;
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        try {
            totalTests++;
            calculatorTests.testSubs();
            testsPast++;
        } catch (Exception ex) {
            testsFailed++;
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        try {
            totalTests++;
            calculatorTests.testMult();
            testsPast++;
        } catch (Exception ex) {
            testsFailed++;
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("totalTests = " + totalTests);
        System.out.println("testsPast = " + testsPast);
        System.out.println("testsFailed = " + testsFailed);
        if (testsFailed>0) {
            throw new Exception("test failed");
        }
    }
}
