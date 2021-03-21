import by.jrr.start.Encoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


/**
* Encoder Tester.
*
* @author <Authors name>
* @since <pre>мар. 21, 2021</pre>
* @version 1.0
*/

public class EncoderTest {

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception {
}


/**
*
* Method: encode(short code)
*
*/

@Test
public void testEncode() throws Exception {

    Encoder exampleTEST = new Encoder();

    Assert.assertEquals(   exampleTEST.encodeFOR_TEST((short)65), 'A');







}


/**
*
* Method: decode(char symbol)
*
*/

@Test
public void testDecode() throws Exception {






}


}

