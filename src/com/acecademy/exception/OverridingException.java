package com.acecademy.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingException {


    public static void main(String[] args) {
        Animal a = new Dog();
        try {
            a.makeNoise();
        } catch (IOException ioe) {

        }
    }
}

class Animal {

    //overriden method
    void makeNoise() throws IOException {
        System.out.println("Hey!");
    }
}

class Dog extends Animal {

    //OVerriding Method
    void makeNoise() throws FileNotFoundException {
        System.out.println("Bark");
    }

}
