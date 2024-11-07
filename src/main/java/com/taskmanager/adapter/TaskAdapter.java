package com.taskmanager.adapter;

import com.taskmanager.model.Task;

public class TaskAdapter {
    private Task task;

    public TaskAdapter(Task task) {
        this.task = task;
    }

    public String getFormattedTask() {
        return "Задача: " + task.getTitle() + ", Описание: " + task.getDescription() + ", Статус: " + task.getStatus();
    }
}
