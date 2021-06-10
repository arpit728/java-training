package com.acecademy.polymorphism;

public class Overriding {

    public static void main(String[] args) {
        Car c = new Creta();
        Car result = c.applyBreak();
        System.out.println(result);
    }
}



class Car {

    Car applyBreak() {
        System.out.println("Generic Break");
        return new Car();
    }
}

class Creta extends Car {

    @Override
    Creta applyBreak() {
        System.out.println("Special Breaks");
        return this;
    }

    void add() {

    }
}

