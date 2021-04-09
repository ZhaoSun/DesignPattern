public class Product {
    private String id;
    private String name;
    private String color;
    private String size;
    private double price;
    private String currency;
    private int quantity;

    public static final String NOT_APPLICABLE = "NOT_APPLICABLE";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Color='" + color + '\'' +
                ", Size='" + size + '\'' +
                ", Price=" + price +
                ", Currency='" + currency + '\'' +
                ", Quantity=" + quantity +
                '}';
    }
}