package Assignment_sep10;
class BankAccount {
    // Static variable shared across all objects
    static String bankName = "SBI Bank";
    static int totalAccounts = 0;

    // Final variable (cannot be changed once assigned)
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;   // 'this' differentiates between class variable and constructor parameter
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;  // Increase count whenever a new account is created
    }

    // Static method to display total accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts in " + bankName + ": " + totalAccounts);
    }

    // Display account details (only if instance is of BankAccount)
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: $" + balance);
            System.out.println("------------------------");
        } else {
            System.out.println("Not a valid BankAccount object!");
        }
    }
}

public class Bank_Account_System {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Alice", 5000);
        BankAccount acc2 = new BankAccount(102, "Bob", 3000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        // Calling static method
        BankAccount.getTotalAccounts();
    }

}
