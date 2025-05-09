package oop.practice2;

public class Main {
    public static void main(String[] args) {
        BankAccount danielAcc = new BankAccount("Daniel");
        BankAccount melinaAcc = new BankAccount("Melina");
        danielAcc.deposit(400);
        danielAcc.withdraw(200);
    }
}
