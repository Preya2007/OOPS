class BankAccount {

    // Instance variables
    String account_holder_name;
    double balance;

    // Static variable (same for all accounts)
    static double interest_rate = 5.0;

    // Constructor
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    // Method to calculate and display interest
    void displayInterest() {
        double interest = (balance * interest_rate) / 100;
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
        System.out.println();
    }

    // Static method to update interest rate
    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("New Interest Rate Updated to: " + interest_rate + "%");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Rahul", 10000);
        BankAccount acc2 = new BankAccount("Priya", 20000);

        // Display interest with default rate
        acc1.displayInterest();
        acc2.displayInterest();

        // Update interest rate using static method
        BankAccount.updateInterestRate(7.0);

        // Display interest again after rate change
        acc1.displayInterest();
        acc2.displayInterest();
    }
}