package com.acecademy.threading;

import java.io.IOException;

public class WaitNotifyDemo {
    public static void main(String[] args) throws IOException, InterruptedException {

        A a = new A(10);
        Thread t = new Thread(new Notifier(a));
        t.start();
        synchronized (a) {
            System.out.println("Calling wait");
            a.wait();
            System.out.println("wait called");
        }
        System.out.println("A has been notified");
    }
    
}

class Notifier implements Runnable {
    private final A a;
    public Notifier(A a) {
        this.a = a;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Execution completed");
        synchronized (this.a) {
            System.out.println("Invoking notify");
            this.a.notifyAll();
        }

    }
}

class A {
    int a;

    public A(int a) {
        this.a = a;
    }
}

