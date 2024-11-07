
package com.taskmanager;

import com.taskmanager.controller.TaskFacade;
import com.taskmanager.view.TaskView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private TaskFacade taskFacade;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        taskFacade = new TaskFacade();

        // Окно для отображения задач
        TaskView taskView = new TaskView(taskFacade);
        taskView.showTaskWindow(primaryStage);
    }
}
