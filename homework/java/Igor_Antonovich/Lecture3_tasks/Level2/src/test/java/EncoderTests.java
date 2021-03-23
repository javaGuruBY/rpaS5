import by.jrr.bean.Encoder;
import org.junit.Assert;
import org.junit.Test;

public class EncoderTests {

    @Test
    public void decodingShouldBeRight_positive() {
        short actualResult = Encoder.decode('F');

        Assert.assertEquals(70, actualResult);
    }

//    @Test
//    public void decodingShouldBeRight_negative() {
//        short actualResult = Encoder.decode('F');
//
//        Assert.assertNotEquals(0, actualResult);
//    }

    @Test
    public void encodingShouldBeRight_positive() {
        char actualResult = Encoder.encode((short)80);

        Assert.assertEquals('P', actualResult);
    }

//    @Test
//    public void encodingShouldBeRight_negative() {
//        char actualResult = Encoder.encode((short)80);
//
//        Assert.assertNotEquals(0, actualResult);
//    }
}
