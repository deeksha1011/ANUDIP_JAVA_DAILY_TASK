import java.util.*;

// Interface Account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

// SavingsAccount class
class SavingsAccount implements Account {
    private double balance;
    private double interestRate = 0.05; // 5% annual interest

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Savings Account.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added to Savings Account.");
    }

    public void viewBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }
}

// CurrentAccount class
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit = 500;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current Account.");
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account.");
        } else {
            System.out.println("Overdraft limit exceeded in Current Account.");
        }
    }

    public void calculateInterest() {
        System.out.println("No interest is calculated for Current Account.");
    }

    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
}

// Bank class
class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account added to bank.");
    }

    public void showAllBalances() {
        for (Account acc : accounts) {
            acc.viewBalance();
        }
    }
}

// Main class to test the banking system
public class BankSystem {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        SavingsAccount savings = new SavingsAccount(1000);
        CurrentAccount current = new CurrentAccount(500);

        myBank.addAccount(savings);
        myBank.addAccount(current);

        savings.deposit(500);
        savings.calculateInterest();
        savings.viewBalance();

        current.withdraw(800);
        current.viewBalance();

        System.out.println("\n--- All Account Balances in Bank ---");
        myBank.showAllBalances();
    }
}
