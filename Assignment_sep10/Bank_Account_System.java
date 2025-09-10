package Assignment_sep10;
class BankAccount {
    static String bankName = "SBI Bank";
    static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;  
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++; 
    }
    public static void getTotalAccounts() {
        System.out.println("Total accounts in " + bankName + ": " + totalAccounts);
    }
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
        BankAccount.getTotalAccounts();
    }

}
