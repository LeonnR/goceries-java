import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Order implements ReadAndWrite, ReadOnly {
    // Static instance for singleton
    private static Order instance;
    
    // List to store multiple orders
    private List<OrderItem> orders;
    
    // File path for storage
    private static final String FILE_PATH = "orders.txt";
    
    // Private constructor
    private Order() {
        orders = new ArrayList<>();
    }
    
    // Static method to get the singleton instance
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
    
    // Add a new order
    public void addOrder(OrderItem order) {
        orders.add(order);
    }
    
    // Get all orders
    public List<OrderItem> getOrders() {
        return orders;
    }
    
    @Override
    public void read() {
        orders.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Each order is stored on 3 consecutive lines (name, quantity, price)
                String name = line;
                int quantity = Integer.parseInt(reader.readLine());
                double price = Double.parseDouble(reader.readLine());
                
                OrderItem orderItem = new OrderItem(name, quantity, price);
                orders.add(orderItem);
            }
            System.out.println("Orders loaded successfully. Total orders: " + orders.size());
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading order data: " + e.getMessage());
        }
    }
    
    @Override
    public void write() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (OrderItem order : orders) {
                writer.write(order.getName());
                writer.newLine();
                writer.write(String.valueOf(order.getQuantity()));
                writer.newLine();
                writer.write(String.valueOf(order.getPrice()));
                writer.newLine();
            }
            System.out.println("Orders saved successfully. Total orders: " + orders.size());
        } catch (IOException e) {
            System.err.println("Error writing order data: " + e.getMessage());
        }
    }
    
    // Inner class to represent individual order items
    public static class OrderItem {
        private String name;
        private int quantity;
        private double price;
        
        public OrderItem(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public int getQuantity() {
            return quantity;
        }
        
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        
        public double getPrice() {
            return price;
        }
        
        public void setPrice(double price) {
            this.price = price;
        }
        
        @Override
        public String toString() {
            return "OrderItem{name='" + name + "', quantity=" + quantity + ", price=" + price + "}";
        }
    }
}
