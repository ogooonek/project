package com.taskmanager.controller;

import com.taskmanager.model.Task;
import com.taskmanager.model.TaskManager;
import com.taskmanager.model.TaskFactory;

public class TaskController {
    private TaskManager taskManager;

    public TaskController() {
        taskManager = TaskManager.getInstance();
    }

    public void addTask(String title, String description, boolean isHighPriority) {
        Task task = TaskFactory.createTask(title, description, isHighPriority);
        taskManager.addTask(task);
    }
}
