package Main;
import java.util.*;

public class Order {
    public enum Priority { STANDARD, EXPEDITED }
    private final String orderID;
    private final List<String> productIDs;
    private final Priority priority;

    public Order(String orderID, List<String> productIDs, Priority priority) {
        this.orderID = orderID;
        this.productIDs = productIDs;
        this.priority = priority;
    }

    public String getOrderID() { return orderID; }
    public List<String> getProductIDs() { return productIDs; }
    public Priority getPriority() { return priority; }
}
