package org.example.thread;

import java.util.concurrent.CompletableFuture;

// create a java program that extends the Thread class to print numbers from 1 to 10
// Each numbers should be prited by a seperate thread, and the threads should run concernently
public class ThreadDemo01 {

    public static void main(String[] args) {
        // create a java program that extends the Thread class to print numbers from 1 to 10
        // Each numbers should be prited by a seperate thread, and the threads should run concernently
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        });

        thread1.start();
        thread2.start();

        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Exception occurred!");
            }
            return "Result";
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex.getMessage());
            return "Fallback result";
        }).thenAccept(result -> {
            System.out.println("Result: " + result);
        });

    }
}
