package org.example.concurrency;

public class BankAccount {

    private int balance = 100;

    void debit(int amount) {
        this.balance -= amount;
    }

    public int getBalance() {
        return this.balance;
    }
}
