package com.acecademy.threading;

public class DaemonThread {

    public static void main(String[] args) throws InterruptedException {


        Thread t = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello!");
            }
        });
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
        t.start();
        Thread.sleep(500);
    }
}


