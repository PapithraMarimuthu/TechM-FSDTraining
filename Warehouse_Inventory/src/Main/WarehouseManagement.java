package Main;
import java.util.Arrays;
public class WarehouseManagement {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        
        // Initialize inventory
        inventoryManager.addProduct(new Product("P001", "Laptop", 10, new Location(1, 1, 1)));
        inventoryManager.addProduct(new Product("P002", "Phone", 20, new Location(1, 1, 2)));
        inventoryManager.addProduct(new Product("P003", "Tablet", 15, new Location(1, 2, 1)));

        // Place orders
        inventoryManager.placeOrder(new Order("O001", Arrays.asList("P001", "P002"), Order.Priority.EXPEDITED));
        inventoryManager.placeOrder(new Order("O002", Arrays.asList("P003"), Order.Priority.STANDARD));

        // Process orders
        inventoryManager.processOrders();
        
        // Ensure proper shutdown
        inventoryManager.shutdown();
    }
}