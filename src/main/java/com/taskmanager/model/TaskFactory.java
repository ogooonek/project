
package com.taskmanager.model;

public class TaskFactory {
    public static Task createTask(String title, String description, boolean isHighPriority) {
        String priority = isHighPriority ? "High" : "Normal"; // Пример приоритета
        boolean isCompleted = false; // По умолчанию задача не завершена

        // Передаем все четыре параметра в конструктор
        return new Task(title, description, priority, isCompleted);
    }
}
