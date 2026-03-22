class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Method to open account
    void openAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }
}

// SavingAccount subclass
class SavingAccount extends BankAccount {
    double interestRate = 5; // 5%

    // Calculate interest
    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest: Rs. " + interest);
    }
}

// FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount {
    double interestRate = 7; // 7%
    int time; // in years

    // Calculate maturity amount
    void maturityAmount() {
        double maturity = balance + (balance * interestRate * time) / 100;
        System.out.println("Maturity Amount: Rs. " + maturity);
    }
}

// Main class
class BankDemo {
    public static void main(String[] args) {

        // Saving Account
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA123", "Preya", 10000);
        System.out.println("\n--- Saving Account ---");
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest();

        // Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD456", "Rahul", 20000);
        fd.time = 2; // 2 years
        System.out.println("\n--- Fixed Deposit Account ---");
        fd.checkBalance();
        fd.maturityAmount();
    }
}