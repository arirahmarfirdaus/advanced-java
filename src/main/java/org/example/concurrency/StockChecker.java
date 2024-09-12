package org.example.concurrency;

public class StockChecker {

    private int stock = 20;

    public int getStock() {
        return this.stock;
    }

    public void updateStock(int amount) {
        this.stock -= amount;
    }
}
