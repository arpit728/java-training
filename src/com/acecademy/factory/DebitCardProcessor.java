package com.acecademy.factory;

public class DebitCardProcessor implements PaymentProcessor{
    @Override
    public void process(int amount) {
        System.out.println("Processing via debit card");

    }
}
