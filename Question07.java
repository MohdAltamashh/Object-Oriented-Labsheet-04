class BankAccount {
    private double balance;

    BankAccount(double openingBalance) {
        if (openingBalance >= 0) {
            balance = openingBalance;
        } else {
            balance = 0;
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposit successful. New balance: %.2f%n", balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    void displayBalance() {
        System.out.printf("Current balance: %.2f%n", balance);
    }
}

public class Question07 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);
        account.displayBalance();
        account.deposit(500.00);
        account.deposit(-50.00);
        account.displayBalance();
    }
}
