package com.acecademy.threading;

public class ThreadCreationDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread1(t1, 5));
//        Thread t3 = new Thread(new MyThread1(10));

        t1.start();
/*        t2.start();

        t2.join();*/
        System.out.println("T1 execution completed");
//        t3.start();
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.yield();
                Thread t = Thread.currentThread();
                t.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Counting : %d\n", i);
        }
    }
}

class MyThread1 implements Runnable {

    private int n;
    private Thread thread;

    public MyThread1(Thread thread, int n) {
        this.thread = thread;
        this.n = n;
    }

    @Override
    public void run() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int temp = n;
        for (int i = 0; i < 3; i++) {
            try {
                Thread t = Thread.currentThread();
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Table of %d  : %d\n", n, temp);
            temp += n;
        }
    }
}