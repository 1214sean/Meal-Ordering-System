module com.example.stagechange {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stagechange to javafx.fxml;
    exports com.example.stagechange;
}