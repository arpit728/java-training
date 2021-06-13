package com.acecademy.factory;

public class PaymentProcessorFactory {

    public static PaymentProcessor createPaymentProcessor(PaymentMode paymentMode) {
        switch (paymentMode) {
            case DEBIT:
                return new DebitCardProcessor();
            case CREDIT:
                return new CreditCardPaymentImpl();
            case UPI:
                return new UpiPaymentImpl();
        }
        throw new IllegalArgumentException("No Implementation");
    }
}
