package com.acecademy.threading;

public class SynchronizedBlockDemo {

    public static void main(String[] args) {
        Display d = new Display();
        Thread t1 = new Thread(new SyncThread(d, "Alice"));
        Thread t2 = new Thread(new SyncThread(d, "Bob"));
        t1.start();
        t2.start();
    }

}
class Display {

    public void wish(String name) {

        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.printf("good morning %s\n", name);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("%s execution completed\n", name);
        }
    }

}

class SyncThread implements Runnable {

    Display display;
    String name;

    public SyncThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.wish(name);
    }
}

