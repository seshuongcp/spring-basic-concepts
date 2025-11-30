package com.example;

public class UPIPaymentService implements PaymentService {


    @Override
    public String pay() {
        return "Paid using UPI";
    }
}
