import java.util.Scanner;

// Interface
interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

// Abstract class with partial implementation
abstract class PartialOrder implements Order {

    String itemName;
    int quantity;
    int orderId;
    static int counter = 1;

    // Implement only placeOrder()
    public void placeOrder(String item, int qty) {
        this.itemName = item;
        this.quantity = qty;
        this.orderId = counter++;

        System.out.println("Order Placed Successfully!");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
    }
}

// Concrete class implementing remaining methods
class FinalOrder extends PartialOrder {

    // Cancel order
    public void cancelOrder(int id) {
        if (this.orderId == id) {
            System.out.println("Order ID " + id + " has been cancelled.");
            itemName = null;
            quantity = 0;
        } else {
            System.out.println("Invalid Order ID!");
        }
    }

    // Generate bill
    public void generateBill() {
        if (itemName == null) {
            System.out.println("No active order to generate bill.");
            return;
        }

        int pricePerItem = 100; // fixed price
        int total = quantity * pricePerItem;

        System.out.println("\n----- BILL -----");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + pricePerItem);
        System.out.println("Total Amount: " + total);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FinalOrder order = new FinalOrder();

        // Take input
        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        // Place order
        order.placeOrder(item, qty);

        // User choice
        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            order.generateBill();
        } else if (choice == 2) {
            System.out.print("Enter Order ID to cancel: ");
            int id = sc.nextInt();
            order.cancelOrder(id);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}