import java.util.Scanner;

// Superclass
class Payment {
    void processPayment(int amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}

// Subclass for Credit Card
class CreditCardPayment extends Payment {
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done Using Credit Card");
    }
}

// Subclass for UPI
class UPIPayment extends Payment {
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

// Main Class
class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your choice:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        
        int choice = sc.nextInt();
        
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        
        Payment p;
        
        if (choice == 1) {
            p = new CreditCardPayment();
        } else if (choice == 2) {
            p = new UPIPayment();
        } else {
            System.out.println("Invalid choice");
            return;
        }
        
        p.processPayment(amount);  // Method overriding
        
        sc.close();
    }
}