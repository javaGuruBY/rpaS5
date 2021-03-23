import by.jrr.bean.Product;
import org.junit.Assert;
import org.junit.Test;

public class ProductTests {
    
    @Test
    public void priseIsPositiveTest() {
        Product testProduct = getProduct();
        boolean actualResult = testProduct.getRegularPrice() > 0;

        Assert.assertTrue(actualResult);
    }

    @Test
    public void discountIsValidTest() {
        Product testProduct = getProduct();
        boolean actualResult = testProduct.getDiscount() > 0 && testProduct.getDiscount() < 100;

        Assert.assertTrue(actualResult);
    }

    @Test
    public void discountTest() {
        Product product = getProduct();
        double actualResult = product.actualPrice(product.getRegularPrice(),product.getDiscount());

        Assert.assertEquals(90.0, actualResult, 0.01);
    }
    
    private Product getProduct() {
        Product testProduct = new Product("Apple");
        testProduct.setRegularPrice(100.0);
        testProduct.setDiscount(10.0);
        
        return testProduct;
    }
}
