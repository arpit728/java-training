package com.acecademy.factory;

public class UpiPaymentImpl implements PaymentProcessor{
    @Override
    public void process(int amount) {
        System.out.println("Processing with UPI");

    }
}
