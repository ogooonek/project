//package com.taskmanager;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.Label;
//
//public class HelloController {
//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
//
//}

package com.taskmanager;

import com.taskmanager.controller.TaskFacade;
import com.taskmanager.model.TaskManager;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField taskNameTextField;

    @FXML
    private TextField taskDescriptionTextField; // Новое поле для описания задачи

    private TaskFacade taskFacade;

    public void TaskController() {
        taskFacade = new TaskFacade();
    }

    @FXML
    private void handleAddTask() {
        String taskName = taskNameTextField.getText();
        String taskDescription = taskDescriptionTextField.getText(); // Получаем описание из нового поля
        String taskPriority = "Low";  // Можно добавить логику для выбора приоритета
        boolean isCompleted = false;  // Значение по умолчанию

        taskFacade.addTask(taskName, taskDescription, taskPriority, isCompleted);
        updateTaskList();
    }

    private void updateTaskList() {
        // Обновление списка задач в UI (можно добавить логику для отображения задач)
    }
}

//package com.taskmanager;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.ListView;
//import javafx.scene.control.TextField;
//
//public class HelloController {
//    @FXML
//    private TextField taskTextField;
//
//    @FXML
//    private ListView<String> taskListView;
//
//    // Метод для добавления задачи
//    @FXML
//    private void handleAddTask() {
//        String task = taskTextField.getText();
//        if (task != null && !task.trim().isEmpty()) {
//            taskListView.getItems().add(task);  // Добавление задачи в список
//            taskTextField.clear();  // Очистка поля ввода
//        }
//    }
//}

