import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private final List<Product> products;

    public ProductRepository(List<Product> products) {
        this.products = products;
    }

    public List<Product> selectByColor(String color)
    {
        List<Product> selectedProducts = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getColor().equalsIgnoreCase(color)) {
                selectedProducts.add(product);
            }
        }

        return selectedProducts;
    }

    public List<Product> selectBySize(String size)
    {
        List<Product> selectedProducts = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getSize().equalsIgnoreCase(size)) {
                selectedProducts.add(product);
            }
        }

        return selectedProducts;
    }

    public List<Product> selectByBelowPrice(double price)
    {
        List<Product> selectedProducts = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getPrice() < price) {
                selectedProducts.add(product);
            }
        }

        return selectedProducts;
    }

    public List<Product> selectByColorSizeAndBelowPrice(String color, String size, double price)
    {
        List<Product> selectedProducts = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getSize().equalsIgnoreCase(size) &&
                    product.getColor().equalsIgnoreCase(color) &&
                    (product.getPrice() < price)) {
                selectedProducts.add(product);
            }
        }

        return selectedProducts;
    }
}
