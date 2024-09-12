package org.example.concurrency;

public class Main {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new RunnableExample());
        Thread threadTwo = new Thread(() -> System.out.printf("Hello world from a lambda style runnable"));

        threadOne.setName("First thread");
        threadTwo.setName("Second thread");

        threadOne.start();
        threadTwo.start();
    }
}
