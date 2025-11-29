package com.example;

import org.springframework.beans.factory.annotation.Value;

public class MultiConstructorService {

    private final GreetingRepository greetingRepository;
    private final String message;

    MultiConstructorService(){
        System.out.println("Constructor 1 called (no args)");
        this.greetingRepository=null;
        this.message="Default message";
    }

   /* MultiConstructorService(GreetingRepository repo){
        System.out.println("Constructor 2 called (repo)");
        this.greetingRepository=repo;
        this.message="Injected via repo constructor";
    }*/


    MultiConstructorService(GreetingRepository repo, String msg){
        System.out.println("Constructor 3 called (repo,msg)");
        this.greetingRepository=repo;
        this.message=msg;
    }

    public String getMessage(){
        return message;
    }
}
