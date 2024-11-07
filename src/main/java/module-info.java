module com.taskmanager.taskmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.taskmanager to javafx.fxml;
    exports com.taskmanager;
}