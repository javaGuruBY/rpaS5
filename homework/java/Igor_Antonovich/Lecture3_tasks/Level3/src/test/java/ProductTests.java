import by.jrr.bean.Product;
import org.junit.Assert;
import org.junit.Test;

public class ProductTests {
    
    @Test
    public void discountTest() {
        
        Product product = new Product("Apple");
        product.setRegularPrice(100.0);
        product.setDiscount(10.0);
        
        double actualResult = product.actualPrice(product.getRegularPrice(),product.getDiscount());

        Assert.assertEquals(90.0, actualResult, 0.01);
    }
}
