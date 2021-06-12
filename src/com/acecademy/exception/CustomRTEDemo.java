package com.acecademy.exception;

public class CustomRTEDemo {

    public static void main(String[] args) {
        CustomRTEDemo customRTEDemo = new CustomRTEDemo();
        try {
            System.out.println(customRTEDemo.eligibleToVote(20));
            System.out.println(customRTEDemo.eligibleToVote(-1));
        } catch (InvalidAgeException iae) {
            System.out.printf("[%d] is an invalid age\n", iae.getAge());
            System.out.println(iae.getMessage());
        }
    }

    boolean eligibleToVote(int age) {
        if (age < 0) {
            throw new InvalidAgeException("Age should be +ve", age);
        }
        return age >= 18;
    }
}
