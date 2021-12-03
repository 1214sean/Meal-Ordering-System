package com.example.stagechange;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HiController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
