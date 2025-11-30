package com.example;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class TaskService {

    public TaskService() {
        System.out.println("TaskService (prototype): Constructor called");
    }

    public void execute() {
        System.out.println("Task executed");
    }
}
