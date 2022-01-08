package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminEdit {

    @FXML
    private DatePicker DateP;

    @FXML
    private MenuItem food1;

    @FXML
    private MenuItem food2;

    @FXML
    private MenuItem food3;

    @FXML
    private MenuItem food4;

    @FXML
    private MenuButton foodtyp;

    @FXML
    private MenuItem ok1;

    @FXML
    private MenuItem ok2;

    @FXML
    private MenuItem ok3;

    @FXML
    private MenuItem ok4;

    @FXML
    private Button save;

    @FXML
    void Food1(ActionEvent event) {

    }

    @FXML
    void Food2(ActionEvent event) {

    }

    @FXML
    void Food3(ActionEvent event) {

    }

    @FXML
    void Food4(ActionEvent event) {

    }

    @FXML
    void FoodTyp(ActionEvent event) {

    }

    @FXML
    void Ok1(ActionEvent event) throws IOException {
        System.out.println("HI");
        Parent blah = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        Scene scene = new Scene(blah);

        Stage appStage = (Stage) save.getScene().getWindow();
        appStage.setScene(scene);
        appStage.show(); //畫面轉跳

    }

    @FXML
    void Ok2(ActionEvent event) throws IOException {
        System.out.println("HI");
        Parent blah = FXMLLoader.load(getClass().getResource("Adminfutureo.fxml"));
        Scene scene = new Scene(blah);

        Stage appStage = (Stage) save.getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();

    }

    @FXML
    void Ok3(ActionEvent event) throws IOException {
        System.out.println("HI");
        Parent blah = FXMLLoader.load(getClass().getResource("AdminEdit.fxml"));
        Scene scene = new Scene(blah);

        Stage appStage = (Stage) save.getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();

    }

    @FXML
    void Ok4(ActionEvent event) throws IOException {
        System.out.println("HI");
        Parent blah = FXMLLoader.load(getClass().getResource("Adminpasto.fxml"));
        Scene scene = new Scene(blah);

        Stage appStage = (Stage) save.getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();

    }

    @FXML
    void Save(ActionEvent event) {

    }

}
