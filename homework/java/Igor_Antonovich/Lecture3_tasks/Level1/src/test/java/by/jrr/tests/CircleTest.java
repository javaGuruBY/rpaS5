package by.jrr.tests;

import by.jrr.bean.circleIssue.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    Circle circle = new Circle(2.0);


    @Test
    public void radiusIsPositive() {
        boolean actualResult = circle.getRadius() > 0;

        Assert.assertTrue(actualResult);
    }

    @Test
    public void circleAreaTest() {
        double actualResult = circle.calculateArea();

        Assert.assertEquals(12.56, actualResult, 0.01);
    }
}
