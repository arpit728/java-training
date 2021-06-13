package com.acecademy.threading.executor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConsumerDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        ExecutorService service = Executors.newFixedThreadPool(1);
        Thread t = new Thread(() -> {
            while (true) {
                queue.offer(1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();


        while (true) {
            Integer message = queue.poll();
            if (message != null) {
                service.submit(() -> System.out.println("Processed " + message));
            }
        }
    }
}
