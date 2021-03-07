package collections;

import java.io.Serializable;

public class Product implements Serializable
{
    private int productId;
    private String productName;
    private double productCost;

    public Product(int productId, String productName, double productCost) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCost=" + productCost +
                '}';
    }
}
