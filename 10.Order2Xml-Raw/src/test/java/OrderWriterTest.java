import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OrderWriterTest {
    @Test
    public void testXmlGeneration() {
        List<Order> orders = GenerateOrders();
        OrderWriter writer = new OrderWriter(orders);
        String xml = writer.GetContents();

        String result =
                "<orders>" +
                        "<order id='321' totalPrice='238.95'>" +
                            "<product id='f1234' color='red' size='medium'>" +
                                "<price currency='USD'>8.95</price>" +
                                "Fire Truck" +
                            "</product>" +
                            "<product id='p1112' color='red' size='medium'>" +
                                "<price currency='USD'>230.0</price>" +
                                "Toy Porsche" +
                            "</product>" +
                        "</order>" +
                        "<order id='537' totalPrice='5.98'>" +
                            "<product id='b3421' color='white' size='small'>" +
                                "<price currency='USD'>2.99</price>" +
                                "Base Ball" +
                            "</product>" +
                        "</order>" +
                "</orders>";

        Assert.assertEquals(result, xml);
    }

    private List<Order> GenerateOrders() {
        List<Order> orders = new ArrayList<Order>();

        // Fire Truck
        Product product1 = new Product();
        product1.setId("f1234");
        product1.setName("Fire Truck");
        product1.setColor("red");
        product1.setSize("medium");
        product1.setCurrency("USD");
        product1.setPrice(8.95);
        product1.setQuantity(1);

        // Toy Porsche
        Product product2 = new Product();
        product2.setId("p1112");
        product2.setName("Toy Porsche");
        product2.setColor("red");
        product2.setSize("medium");
        product2.setCurrency("USD");
        product2.setPrice(230.0);
        product2.setQuantity(1);

        // Order1
        Order order1 = new Order();
        order1.setId("321");
        order1.setTotalPrice(238.95);
        order1.getProducts().add(product1);
        order1.getProducts().add(product2);
        orders.add(order1);

        // Toy Porsche
        Product product3 = new Product();
        product3.setId("b3421");
        product3.setName("Base Ball");
        product3.setColor("white");
        product3.setSize("small");
        product3.setCurrency("USD");
        product3.setPrice(2.99);
        product3.setQuantity(2);

        // Order2
        Order order2 = new Order();
        order2.setId("537");
        order2.setTotalPrice(5.98);
        order2.getProducts().add(product3);
        orders.add(order2);

        return orders;
    }
}
