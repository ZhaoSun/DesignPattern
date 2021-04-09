import java.util.List;

public class OrderWriter {
    private List<Order> orders;

    public OrderWriter(List<Order> orders) {
        this.orders = orders;
    }

    public String GetContents() {
        StringBuilder xml = new StringBuilder();
        WriteOrdersTo(xml);
        return xml.toString();
    }

    private void WriteOrdersTo(StringBuilder xml) {
        xml.append("<orders>");
        for (int i = 0; i < orders.size(); i++)
        {
            Order order = orders.get(i);
            xml.append("<order");
            xml.append(" id='");
            xml.append(order.getId());
            xml.append("' totalPrice='");
            xml.append(order.getTotalPrice());
            xml.append("'>");
            WriteProductsTo(xml, order);
            xml.append("</order>");
        }
        xml.append("</orders>");
    }

    private void WriteProductsTo(StringBuilder xml, Order order)
    {
        for (int i = 0; i < order.getProducts().size(); i++)
        {
            Product product = order.getProducts().get(i);
            xml.append("<product");
            xml.append(" id='");
            xml.append(product.getId());
            xml.append("'");
            xml.append(" color='");
            xml.append(product.getColor());
            xml.append("'");
            if (product.getSize() != Product.NOT_APPLICABLE)
            {
                xml.append(" size='");
                xml.append(product.getSize());
                xml.append("'");
            }
            xml.append(">");
            WritePriceTo(xml, product);
            xml.append(product.getName());
            xml.append("</product>");
        }
    }

    private void WritePriceTo(StringBuilder xml, Product product)
    {
        xml.append("<price");
        xml.append(" currency='");
        xml.append(product.getCurrency());
        xml.append("'>");
        xml.append(product.getPrice());
        xml.append("</price>");
    }
}
