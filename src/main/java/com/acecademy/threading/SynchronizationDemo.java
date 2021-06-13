package com.acecademy.threading;

public class SynchronizationDemo {


    public static void main(String[] args) {

        User user = new User();

        Thread t1 = new Thread(new MyThread5());
        Thread t2 = new Thread(new MyThread6());
        t1.start();
        t2.start();

    }

}

class MyThread3 implements Runnable {

    User user;

    public MyThread3(User user) {
        this.user = user;
    }


    @Override
    public void run() {
        try {
            user.m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread4 implements Runnable {

    User user;

    public MyThread4(User user) {
        this.user = user;
    }


    @Override
    public void run() {
        try {
            user.m2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class MyThread5 extends Thread {

    public MyThread5() {
    }


    @Override
    public void run() {
        try {
            User.m3();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class MyThread6 extends Thread {

    public MyThread6() {
    }

    @Override
    public void run() {
        try {
            User.m4();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


class User {


    public User() {}

    synchronized void m1() throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("m1 Method");
        }
    }
    synchronized void m2() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("m2 Method");
        }
    }

    static synchronized void m3() throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("m3 Method");
        }
    }

    static synchronized void m4() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("m4 Method");
        }
    }
    void m5() {
        System.out.println("m3");
    }
}



