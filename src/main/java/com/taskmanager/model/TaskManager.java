package com.taskmanager.model;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static TaskManager instance;
    private List<Task> tasks;

    private TaskManager() {
        tasks = new ArrayList<>();
    }

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Задача добавлена: " + task);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
