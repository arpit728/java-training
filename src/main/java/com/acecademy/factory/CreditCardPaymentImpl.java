package com.acecademy.factory;

public class CreditCardPaymentImpl implements PaymentProcessor {
    @Override
    public void process(int amount) {
        System.out.println("Processing with credit card");
    }
}
