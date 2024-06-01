import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private List<String> history;

    public Account(double initialBalance) {
        this.balance = initialBalance;
        this.history = new ArrayList<>();
        this.history.add("Account created with initial balance: R " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            history.add("User deposited: R " + amount + ", New Balance: R " + balance);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            history.add("User withdrawn: R " + amount + ", New Balance: R " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Withdraw amount must be positive");
        }
    }

    public List<String> getHistory() {
        return history;
    }

    public void transfer(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            history.add("Transferred: R " + amount + ", New Balance: R " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Transfer amount must be positive");
        }
    }
}
