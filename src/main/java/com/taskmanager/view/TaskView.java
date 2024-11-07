
package com.taskmanager.view;

import com.taskmanager.controller.TaskFacade;
import com.taskmanager.model.Task;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaskView {
    private TaskFacade taskFacade;
    private TextField taskTextField;
    private ListView<Task> taskListView;
    private ComboBox<String> priorityComboBox;

    public TaskView(TaskFacade taskFacade) {
        this.taskFacade = taskFacade;
        this.taskTextField = new TextField();
        this.taskListView = new ListView<>();
        this.priorityComboBox = new ComboBox<>();
        priorityComboBox.getItems().addAll("Низкий", "Средний", "Высокий");
    }

    public void showTaskWindow(Stage stage) {
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(taskTextField, priorityComboBox, createAddTaskButton(), taskListView);

        Scene scene = new Scene(vbox, 400, 300);
        stage.setTitle("Менеджер задач");
        stage.setScene(scene);
        stage.show();
    }

    private Button createAddTaskButton() {
        Button addButton = new Button("Добавить задачу");

        // Обработчик нажатия кнопки
        addButton.setOnAction(event -> {
            String taskName = taskTextField.getText();
            String priority = priorityComboBox.getValue();
            if (!taskName.isEmpty() && priority != null) {
                taskFacade.addTask(taskName, "Описание задачи: " + taskName, priority, false);
                updateTaskListView(); // Обновляем отображение списка задач
                taskTextField.clear(); // Очищаем поле ввода
                priorityComboBox.setValue(null); // Сбрасываем значение приоритета
            }
        });

        return addButton;
    }

    private void updateTaskListView() {
        taskListView.getItems().clear();
        taskListView.getItems().addAll(taskFacade.getTasks()); // Отображаем все задачи
    }
}
