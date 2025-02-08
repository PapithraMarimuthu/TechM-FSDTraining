package Main;
import java.util.*;
import java.util.concurrent.*;

public class InventoryManager {
    private final ConcurrentHashMap<String, Product> products = new ConcurrentHashMap<>();
    private final PriorityBlockingQueue<Order> orderQueue = new PriorityBlockingQueue<>(10, new OrderComparator());
    private final ExecutorService executor = Executors.newFixedThreadPool(3);

    public synchronized void addProduct(Product product) {
        products.put(product.getProductID(), product);
    }

    public void placeOrder(Order order) {
        orderQueue.offer(order);
    }

    public void processOrders() {
        while (!orderQueue.isEmpty()) {
            executor.execute(() -> {
                try {
                    Order order = orderQueue.poll();
                    if (order != null) fulfillOrder(order);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }

    private void fulfillOrder(Order order) {
        for (String productID : order.getProductIDs()) {
            Product product = products.get(productID);
            if (product != null) {
                try {
                    product.reduceStock(1);
                } catch (OutOfStockException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Product " + productID + " not found in inventory.");
            }
        }
    }
    
    public void shutdown() {
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}
