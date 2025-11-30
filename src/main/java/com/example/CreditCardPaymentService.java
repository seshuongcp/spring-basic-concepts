package com.example;

public class CreditCardPaymentService  implements PaymentService {


    @Override
    public String pay() {
        return "Paid using Credit Card";
    }
}
