package com.acecademy.threading;

public class WaitNotifyAllDemo {

    public static void main(String[] args) throws InterruptedException {
        A a = new A(10);
        Thread t = new Thread(new WaitingThread(a));
        Thread t1 = new Thread(new NotifyAllThread(a));
        t1.start();
        t.start();
        synchronized (a) {
            System.out.println("Calling wait");
            a.wait();
            System.out.println("wait called");
        }
        System.out.println("A has been notified");
    }
}

class WaitingThread implements Runnable {

    private final A a;

    public WaitingThread(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        System.out.println("MyThread2 is waiting");

        synchronized (this.a) {
            try {
                a.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Wait is over");
    }
}


class NotifyAllThread implements Runnable {

    private final A a;

    public NotifyAllThread(A a) {
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
