package com.example;

public class WorkflowService {

    private final TaskService taskService; // prototype

    public WorkflowService(TaskService taskService) {
        this.taskService = taskService;
    }

    public void run() {
        taskService.execute();
    }
}
