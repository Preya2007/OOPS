import java.util.Scanner;

class BankAccount {

    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account Id: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc[] = new BankAccount[5];

        acc[0] = new BankAccount();
        acc[0].assignValues("101", "Riya", 5000);

        acc[1] = new BankAccount();
        acc[1].assignValues("102", "Karan", 7000);

        acc[2] = new BankAccount();
        acc[2].assignValues("103", "Neha", 9000);

        acc[3] = new BankAccount();
        acc[3].assignValues("104", "Amit", 6000);

        acc[4] = new BankAccount();
        acc[4].assignValues("105", "Priya", 8000);

        System.out.println("\nAll Account Details:");
        for (int i = 0; i < 5; i++) {
            acc[i].displayValues();
        }

        System.out.print("Enter Account Id to search: ");
        String id = sc.nextLine();

        boolean flag = false;

        for (int i = 0; i < 5; i++) {
            if (acc[i].accountId.equals(id)) {
                System.out.println("Account Found:");
                acc[i].displayValues();
                flag = true;
                break;
            }
        }

        if (flag == false) {
            System.out.println("Account not found.");
        }

        sc.close();
    }
}

