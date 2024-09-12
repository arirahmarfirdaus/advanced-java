package org.example.concurrency;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello world from a Runnable");
    }
}
