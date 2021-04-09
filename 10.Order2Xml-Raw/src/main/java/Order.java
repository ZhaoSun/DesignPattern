import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private List<Product> products;
    private double totalPrice;

    public Order() {
        products = new ArrayList<Product>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Id='" + id + '\'' +
                ", Products=" + products +
                ", TotalPrice=" + totalPrice +
                '}';
    }
}