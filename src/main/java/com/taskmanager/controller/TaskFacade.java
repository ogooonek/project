
package com.taskmanager.controller;

import com.taskmanager.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskFacade {
    private List<Task> tasks;

    public TaskFacade() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String taskName, String taskDescription, String taskPriority, boolean isCompleted) {
        // Теперь мы передаем все четыре параметра в конструктор Task
        tasks.add(new Task(taskName, taskDescription, taskPriority, isCompleted));
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
