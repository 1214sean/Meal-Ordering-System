package com.example.stagechange;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

    }

    @FXML
    private void ChangeScene(javafx.event.ActionEvent event) throws IOException
    {
        {
            Parent blah = FXMLLoader.load(getClass().getResource("hi-view.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }
    }
}