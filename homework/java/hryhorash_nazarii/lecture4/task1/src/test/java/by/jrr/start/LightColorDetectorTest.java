package by.jrr.start;

import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {

    private LightColorDetector colorRange = new LightColorDetector();

    @Test
    public void detectViolet() {
       String expected = "Violet";
       String actual = colorRange.detect(444);

       assertEquals("detectViolet", expected, actual);
    }

    @Test
    public void detectBlue() {
        String expected = "Blue";
        String actual = colorRange.detect(469);

        assertEquals("detectBlue", expected, actual);
    }

    @Test
    public void detectGreen() {
        String expected = "Green";
        String actual = colorRange.detect(555);

        assertEquals("detectGreen", expected, actual);
    }

    @Test
    public void detectYellow() {
        String expected = "Yellow";
        String actual = colorRange.detect(589);

        assertEquals("detectYellow", expected, actual);
    }

    @Test
    public void detectOrange() {
        String expected = "Orange";
        String actual = colorRange.detect(606);

        assertEquals("detectOrange", expected, actual);
    }

    @Test
    public void detectRed() {
        String expected = "Red";
        String actual = colorRange.detect(666);

        assertEquals("detectRed", expected, actual);
    }

    @Test
    public void detectInvisibleColor() {
        String expected = "Invisible Light";
        String actual = colorRange.detect(123456789);

        assertEquals("detectInvisibleColor", expected, actual);
    }
}