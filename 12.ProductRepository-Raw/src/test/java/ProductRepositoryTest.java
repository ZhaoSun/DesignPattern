import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryTest {
    @Test
    public void testSelectByColor() {
        ProductRepository productRepo = new ProductRepository(generateProducts());

        List<Product> products = productRepo.selectByColor("red");

        Assert.assertEquals(2, products.size());
        Assert.assertEquals("Fire Truck", products.get(0).getName());
        Assert.assertEquals("Toy Porsche", products.get(1).getName());
    }

    @Test
    public void testSelectBySize() {
        ProductRepository productRepo = new ProductRepository(generateProducts());

        List<Product> products = productRepo.selectBySize("large");

        Assert.assertEquals(1, products.size());
        Assert.assertEquals("Frisbee", products.get(0).getName());
    }

    @Test
    public void testSelectByBelowPrice() {
        ProductRepository productRepo = new ProductRepository(generateProducts());

        List<Product> products = productRepo.selectByBelowPrice(10.0);

        Assert.assertEquals(3, products.size());
        Assert.assertEquals("Fire Truck", products.get(0).getName());
        Assert.assertEquals("Base Ball", products.get(1).getName());
        Assert.assertEquals("Frisbee", products.get(2).getName());
    }

    @Test
    public void testSelectByColorSizeAndBelowPrice() {
        ProductRepository productRepo = new ProductRepository(generateProducts());

        List<Product> products = productRepo.selectByColorSizeAndBelowPrice("red","small",10.0);

        Assert.assertEquals(1, products.size());
        Assert.assertEquals("Fire Truck", products.get(0).getName());
    }

    private List<Product> generateProducts() {
        List<Product> products = new ArrayList<Product>();

        // Fire Truck
        Product product1 = new Product();
        product1.setId("f1234");
        product1.setName("Fire Truck");
        product1.setColor("red");
        product1.setSize("small");
        product1.setCurrency("USD");
        product1.setPrice(8.95);
        product1.setQuantity(1);
        products.add(product1);

        // Toy Porsche
        Product product2 = new Product();
        product2.setId("p1112");
        product2.setName("Toy Porsche");
        product2.setColor("red");
        product2.setSize("NOT_APPLICABLE");
        product2.setCurrency("USD");
        product2.setPrice(230.0);
        product2.setQuantity(1);
        products.add(product2);

        // Base Ball
        Product product3 = new Product();
        product3.setId("b3421");
        product3.setName("Base Ball");
        product3.setColor("white");
        product3.setSize("NOT_APPLICABLE");
        product3.setCurrency("USD");
        product3.setPrice(8.95);
        product3.setQuantity(1);
        products.add(product3);

        // Frisbee
        Product product4 = new Product();
        product4.setId("f4321");
        product4.setName("Frisbee");
        product4.setColor("pink");
        product4.setSize("large");
        product4.setCurrency("USD");
        product4.setPrice(9.99);
        product4.setQuantity(1);
        products.add(product4);

        // Barbie Classic
        Product product5 = new Product();
        product5.setId("b7654");
        product5.setName("Barbie Classic");
        product5.setColor("yellow");
        product5.setSize("small");
        product5.setCurrency("USD");
        product5.setPrice(15.95);
        product5.setQuantity(1);
        products.add(product5);

        return products;
    }
}
