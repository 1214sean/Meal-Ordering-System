module com.example.foodorderingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.foodorderingsystem to javafx.fxml;
    exports com.example.foodorderingsystem;
}