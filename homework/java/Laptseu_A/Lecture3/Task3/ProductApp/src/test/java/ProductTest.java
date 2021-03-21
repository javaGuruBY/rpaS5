

import by.jrr.start.Product;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Product Tester.
 *
 * @author <Authors name>
 * @since <pre>���. 21, 2021</pre>
 * @version 1.0
 */
@DisplayName("Product Test")
class ProductTest {

    @BeforeEach
    void before() throws Exception {



    }

    @AfterEach
    void after() throws Exception {
    }

    /**
     * Method: actualPrice()
     */
    @Test
    @DisplayName("Test Actual Price")
    void testActualPrice() throws Exception {

        Product product_TEST = new Product("Milk_TEST");

        product_TEST.setRegularPrice(1);
        product_TEST.setDiscount(20);
        product_TEST.printInformation();

        Assertions.assertEquals(product_TEST.actualPrice(), 0.8);



    }

    /**
     * Method: printInformation()
     */

}
