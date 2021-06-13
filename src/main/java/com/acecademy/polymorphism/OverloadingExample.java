package com.acecademy.polymorphism;

public class OverloadingExample {


    float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingExample oe = new OverloadingExample();
        oe.add(2, 5);
        oe.add('a', 'b');
    }
}
