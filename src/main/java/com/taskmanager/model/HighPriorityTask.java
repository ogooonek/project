
package com.taskmanager.model;

public class HighPriorityTask extends Task {
    public HighPriorityTask(String title, String description) {
        // Указываем "High" как приоритет для высокоприоритетных задач
        // И по умолчанию считаем, что задача не завершена (isCompleted = false)
        super(title, description, "High", false);
        this.setStatus(TaskStatus.HIGH_PRIORITY); // Статус для высокоприоритетных задач
    }

    @Override
    public String toString() {
        return super.toString() + " (Высокий приоритет)";
    }
}
