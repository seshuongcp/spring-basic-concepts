package com.example;

public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository){
        System.out.println("GreetingService: Constructor called");
        this.greetingRepository= greetingRepository;
    }
    String greet(){
        return greetingRepository.getGreetingMessage();
    }
}
