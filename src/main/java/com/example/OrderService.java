package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public String getStatus() {
        return orderRepository.getOrderStatus();
    }

}
