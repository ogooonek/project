package com.taskmanager.model;

public class TaskInProgressStrategy implements TaskStrategy {
    @Override
    public void execute(Task task) {
        task.setStatus(TaskStatus.IN_PROGRESS);
        System.out.println("Задача в процессе: " + task);
    }
}
