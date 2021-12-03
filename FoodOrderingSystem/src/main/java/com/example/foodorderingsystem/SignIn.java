package com.example.foodorderingsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignIn {

    @FXML
    private PasswordField account;

    @FXML
    private Button login;

    @FXML
    private PasswordField pass;

    @FXML
    private Button resetpass;

    @FXML
    void enterlobby(ActionEvent event)  throws IOException{

            {
                Parent blah = FXMLLoader.load(getClass().getResource("LobbyPage.fxml"));
                Scene scene = new Scene(blah);

                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(scene);
                appStage.show();
            }


    }

}
