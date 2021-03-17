package by.jrr.start.mytests;

public class TestRunner {

    static int totalTests = 0;
    static int testsPassed = 0;
    static int testsFailed = 0;

    public static void runTest() throws Exception{
        var calculatorTests = new CalculatorTests();

        try {
            totalTests++;
            calculatorTests.testSum();
            testsPassed++;
        } catch (Exception ex) {
            testsFailed++;
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        try {
            totalTests++;
            calculatorTests.testSubs();
            testsPassed++;
        } catch (Exception ex) {
            testsFailed++;
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        try {
            totalTests++;
            calculatorTests.testMult();
            testsPassed++;
        } catch (Exception ex) {
            testsFailed++;
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println("totalTests = " + totalTests);
        System.out.println("testsPassed = " + testsPassed);
        System.out.println("testsFailed = " + testsFailed);
        if(testsFailed>0) {
            throw new Exception("test failed!");
        }
    }


}
