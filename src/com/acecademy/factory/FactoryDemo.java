package com.acecademy.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        int amount = 10;
        PaymentMode paymentMode = PaymentMode.DEBIT;
        PaymentProcessor paymentProcessor = PaymentProcessorFactory.createPaymentProcessor(paymentMode);
        paymentProcessor.process(amount);
    }
}
