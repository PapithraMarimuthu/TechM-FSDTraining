package Main;
import java.util.concurrent.*;

public class Product {
    private final String productID;
    private final String name;
    private int quantity;
    private final Location location;

    public Product(String productID, String name, int quantity, Location location) {
        this.productID = productID;
        this.name = name;
        this.quantity = quantity;
        this.location = location;
    }

    public String getProductID() { return productID; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public Location getLocation() { return location; }
    
    public synchronized void reduceStock(int amount) throws OutOfStockException {
        if (quantity < amount) throw new OutOfStockException("Product " + name + " is out of stock.");
        quantity -= amount;
    }
}