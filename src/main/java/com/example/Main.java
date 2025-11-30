package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String [] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        WorkflowService wf1 = context.getBean(WorkflowService.class);
        WorkflowService wf2 = context.getBean(WorkflowService.class);

        System.out.println(wf1 == wf2); // true (singleton)

        wf1.run();
        wf2.run();
    }
}
