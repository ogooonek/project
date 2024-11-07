package com.taskmanager.model;

public class TaskCompletedStrategy implements TaskStrategy {
    @Override
    public void execute(Task task) {
        task.setStatus(TaskStatus.COMPLETED);
        System.out.println("Задача завершена: " + task);
    }
}
