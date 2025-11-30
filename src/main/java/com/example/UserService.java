package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    private UserRepository userRepository;

    UserService() {
        System.out.println("UserService: No arg constructor called");
    }

    @Autowired
    public void setUserRepository1(UserRepository userRepository) {
        System.out.println("UserService: setUserRepository1 called");
        this.userRepository = userRepository;
    }

    @Autowired
    public void setUserRepository2(UserRepository userRepository) {
        System.out.println("UserService: setUserRepository2 called");
        this.userRepository = userRepository;
    }

    @Autowired
    public void setUserRepository3(UserRepository userRepository) {
        System.out.println("UserService: setUserRepository3 called");
        this.userRepository = userRepository;
    }

    @Autowired
    public void setUserRepository4(UserRepository userRepository) {
        System.out.println("UserService: setUserRepository4 called");
        this.userRepository = userRepository;
    }

    public String getUserName() {
        return userRepository.findUserName();
    }

}
