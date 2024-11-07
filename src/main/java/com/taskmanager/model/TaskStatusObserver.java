package com.taskmanager.model;

public class TaskStatusObserver implements TaskObserver {
    @Override
    public void update(Task task) {
        System.out.println("Статус задачи обновлён: " + task);
    }
}
