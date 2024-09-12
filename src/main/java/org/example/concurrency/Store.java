package org.example.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Store {

    static synchronized void purchase(StockChecker stockChecker, int amount) {
        int stock = stockChecker.getStock();
        if (stock - amount < 0) {
            System.out.println("Out of stock");
        } else {
            System.out.println("Item is in stock");
            stockChecker.updateStock(amount);
            System.out.println(amount + " items purchased");
        }
        System.out.println("Current stock: " + stockChecker.getStock());
    }

    public static void main(String[] args) {

        StockChecker stockChecker = new StockChecker();

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.submit(() -> purchase(stockChecker, 20));
        executorService.submit(() -> purchase(stockChecker, 20));
        executorService.submit(() -> purchase(stockChecker, 20));
        executorService.submit(() -> purchase(stockChecker, 20));

        executorService.shutdown();
    }
}
