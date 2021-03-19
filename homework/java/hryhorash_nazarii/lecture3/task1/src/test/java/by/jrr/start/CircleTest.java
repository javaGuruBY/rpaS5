package by.jrr.start;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class CircleTest extends TestCase {

    public void test_1CalculateArea() {
        double radius = 169;
        double expected = 89727.02778;

        Circle circle = new Circle(169);

        double actual = (double)Math.round(circle.calculateArea() * 100000d) / 100000d;

        assertEquals("testArea", expected, actual);
    }

    public void test_2CalculateArea() {
        double radius = 1345;
        double expected = 5683219.65016;

        Circle circle = new Circle(radius);

        double actual = (double)Math.round(circle.calculateArea() * 100000d) / 100000d;

        assertEquals("testArea", expected, actual);
    }

    public void test_3CalculateArea() {
        double radius = 111;
        double expected = 38707.56308;

        Circle circle = new Circle(radius);

        double actual = (double)Math.round(circle.calculateArea() * 100000d) / 100000d;

        assertEquals("testArea", expected, actual);
    }
}