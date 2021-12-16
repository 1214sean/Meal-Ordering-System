package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class PersonInfo {

    @FXML
    private MenuItem ok1;

    @FXML
    private MenuItem ok2;

    @FXML
    private MenuItem ok3;

    @FXML
    private MenuItem ok4;

    @FXML
    private Menu pinfo;

    @FXML
    private Button reportE;

    @FXML
    private Menu reservehis;

    @FXML
    private Menu resmeal;

    @FXML
    private Menu signout;

    @FXML
    void Ok1(ActionEvent event) throws IOException {
        {
            System.out.println("HI");
            Parent blah = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) reportE.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }

    }

    @FXML
    void Ok2(ActionEvent event) throws IOException {
        {
            System.out.println("HI");
            Parent blah = FXMLLoader.load(getClass().getResource("ReserveHis.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) reportE.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }

    }

    @FXML
    void Ok3(ActionEvent event) {

    }

    @FXML
    void Ok4(ActionEvent event) throws IOException {
        {
            System.out.println("HI");
            Parent blah = FXMLLoader.load(getClass().getResource("LobbyPage.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) reportE.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }

    }

    @FXML
    void ReportE(ActionEvent event) {

    }

}
