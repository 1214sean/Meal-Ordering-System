package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class Adminfutureo {

    @FXML
    private ListView<?> lsview;

    @FXML
    private MenuItem ok;

    @FXML
    private MenuItem ok3;

    @FXML
    private MenuItem ok4;

    @FXML
    void Ok1(ActionEvent event) throws IOException {
        System.out.println("HI");
        Parent blah = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        Scene scene = new Scene(blah);

        Stage appStage = (Stage) lsview.getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    @FXML
    void Ok2(ActionEvent event) throws IOException {
        System.out.println("HI");
        Parent blah = FXMLLoader.load(getClass().getResource("Adminfutureo.fxml"));
        Scene scene = new Scene(blah);

        Stage appStage = (Stage) lsview.getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();

    }

    @FXML
    void Ok3(ActionEvent event) throws IOException {
        System.out.println("HI");
        Parent blah = FXMLLoader.load(getClass().getResource("AdminEdit.fxml"));
        Scene scene = new Scene(blah);

        Stage appStage = (Stage) lsview.getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();

    }

    @FXML
    void Ok4(ActionEvent event) throws IOException {
        System.out.println("HI");
        Parent blah = FXMLLoader.load(getClass().getResource("Adminpasto.fxml"));
        Scene scene = new Scene(blah);

        Stage appStage = (Stage) lsview.getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();

    }

}
