package org.example.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableExample());
        executorService.submit(() -> System.out.println("Hello world from a runnable running in an ExecutorService"));

        executorService.shutdown();
    }
}
