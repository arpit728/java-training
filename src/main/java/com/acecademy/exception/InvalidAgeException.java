package com.acecademy.exception;

public class InvalidAgeException extends RuntimeException {

    private int age;

    InvalidAgeException(String message, int age) {
        super(message);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
