////package com.taskmanager.model;
////
////public class Task {
////    private String title;
////    private String description;
////    private String priority;
////    private boolean isCompleted;
////    private TaskStatus status;  // Добавлен статус задачи
////
////    // Обновленный конструктор, который принимает все параметры
////    public Task(String title, String description, String priority, boolean isCompleted) {
////        this.title = title;
////        this.description = description;
////        this.priority = priority;
////        this.isCompleted = isCompleted;
////        this.status = TaskStatus.PENDING;  // По умолчанию статус "Ожидает"
////    }
////
////    // Геттеры и сеттеры
////    public String getTitle() {
////        return title;
////    }
////
////    public String getDescription() {
////        return description;
////    }
////
////    public String getPriority() {
////        return priority;
////    }
////
////    public boolean isCompleted() {
////        return isCompleted;
////    }
////
////    public void setCompleted(boolean completed) {
////        isCompleted = completed;
////    }
////
////    public TaskStatus getStatus() {
////        return status;
////    }
////
////    public void setStatus(TaskStatus status) {
////        this.status = status;
////    }
////
////    @Override
////    public String toString() {
////        return title + " - " + description + " - Приоритет: " + priority + " - Статус: " + status;
////    }
////}
//
//package com.taskmanager.model;
//
//public class Task {
//    private String title;
//    private String description;
//    private String priority;
//    private boolean isCompleted;
//    private TaskStatus status;
//
//    // Обновленный конструктор с отдельным полем для описания
//    public Task(String title, String description, String priority, boolean isCompleted) {
//        this.title = title;
//        this.description = description;
//        this.priority = priority;
//        this.isCompleted = isCompleted;
//        this.status = TaskStatus.PENDING;  // Устанавливаем статус по умолчанию
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public String getPriority() {
//        return priority;
//    }
//
//    public boolean isCompleted() {
//        return isCompleted;
//    }
//
//    public void setCompleted(boolean completed) {
//        isCompleted = completed;
//    }
//
//    public TaskStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus(TaskStatus status) {
//        this.status = status;
//    }
//
//    @Override
//    public String toString() {
//        return title + " - " + description + " - Статус: " + status;
//    }
//}

package com.taskmanager.model;

public class Task {
    private String title;
    private String description;
    private String priority;
    private boolean isCompleted;
    private TaskStatus status;  // Добавлен статус задачи

    // Обновленный конструктор, который принимает все параметры
    public Task(String title, String description, String priority, boolean isCompleted) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isCompleted = isCompleted;
        this.status = TaskStatus.PENDING;  // По умолчанию статус "Ожидает"
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return title + " - Приоритет: " + priority + " - Статус: " + status;
    }
}
