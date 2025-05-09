package oop.practice2;

public class BankAccount {
    private String ownerName;
    private String accountNumber;
    private double balance;

    public BankAccount(String name) {
        this.ownerName = name;
        this.balance = 0.0;
        this.accountNumber = generateAccountNumber();
        System.out.println("Account created for: " + ownerName + "\nAccount Number: " + accountNumber);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount + "$\nNew balance: " + balance + "$");
        }else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew: " + amount + "$\nCurrent balance: " + balance + "$");
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public String generateAccountNumber() {
        return "ACC" + (int) (Math.random() * 10000);
    }

}
