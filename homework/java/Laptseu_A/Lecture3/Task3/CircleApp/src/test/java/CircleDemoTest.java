import by.jrr.start.Circle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* CircleDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>���. 21, 2021</pre> 
* @version 1.0 
*/ 
public class CircleDemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception {
    Circle R3_Test = new Circle(3);
    Circle R0_Test = new Circle(0);

    Assert.assertTrue(R3_Test.calculateArea() > 0  );
    Assert.assertTrue(R0_Test.calculateArea() == 0);





//TODO: Test goes here... 
} 


} 
