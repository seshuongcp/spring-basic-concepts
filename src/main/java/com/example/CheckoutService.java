package com.example;

public class CheckoutService {

    private final PaymentService paymentService;

    CheckoutService(PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("Inside CheckoutService constructor");
    }

    public void processOrder(){
        paymentService.pay();
    }
}
