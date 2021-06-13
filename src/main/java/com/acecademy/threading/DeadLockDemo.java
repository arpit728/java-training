package com.acecademy.threading;

public class DeadLockDemo {

    public static void main(String[] args) {
        String s1 = "alice";
        String s2 = "bob";
        Thread t1 = new Thread(new DeadLockThread1(s1, s2));
        Thread t2 = new Thread(new DeadLockThread2(s1, s2));
        t1.start();
        t2.start();
    }

}

class DeadLockThread1 implements Runnable {

    private final String resource1;
    private final String resource2;

    public DeadLockThread1(String resource1, String resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }


    @Override
    public void run() {

        synchronized (resource1) {

            System.out.println("Resource1 Locked by t1");
            synchronized (resource2) {
                System.out.println("Resource2 Locked by t1");

            }
        }
    }
}

class DeadLockThread2 implements Runnable {
    private final String resource1;
    private final String resource2;

    public DeadLockThread2(String resource1, String resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }
    @Override
    public void run() {

        synchronized (resource2) {
            System.out.println("Resource2 Locked by t2");

            synchronized (resource1) {
                System.out.println("Resource1 Locked by t2");

            }
        }
    }
}




