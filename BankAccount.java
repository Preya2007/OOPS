class BankAccount {

    // Instance variables
    String account_holder_name;
    double balance;

    // Static variable (common for all accounts)
    static double interest_rate;

    // Constructor
    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    // Method to calculate interest
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    // Method to display interest
    void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
        System.out.println();
    }

    // Static method to update interest rate
    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest Rate Updated to: " + interest_rate + "%");
        System.out.println();
    }

    public static void main(String[] args) {

        // Set initial interest rate
        BankAccount.updateInterestRate(5.0);

        // Create accounts
        BankAccount acc1 = new BankAccount("Preya", 10000);
        BankAccount acc2 = new BankAccount("Riya", 20000);

        // Display interest
        acc1.displayInterest();
        acc2.displayInterest();

        // Update interest rate
        BankAccount.updateInterestRate(7.0);

        // Display updated interest
        acc1.displayInterest();
        acc2.displayInterest();
    }
}