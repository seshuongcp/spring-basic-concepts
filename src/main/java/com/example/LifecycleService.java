package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class LifecycleService {

    public LifecycleService() {
        System.out.println("LifecycleService: Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("LifecycleService: @PostConstruct init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("LifecycleService: @PreDestroy destroy");
    }
}

