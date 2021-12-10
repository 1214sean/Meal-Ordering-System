package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class LobbyPage {

    @FXML
    private Button canorder;

    @FXML
    private DatePicker dpicker;

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
    private Menu pinfo;

    @FXML
    private Menu reservehis;

    @FXML
    private Menu resmeal;

    @FXML
    private CheckBox sel1;

    @FXML
    private CheckBox sel2;

    @FXML
    private CheckBox sel3;

    @FXML
    private CheckBox sel4;

    @FXML
    private MenuButton seltime;

    @FXML
    private MenuItem seltime1;

    @FXML
    private MenuItem seltime2;

    @FXML
    private MenuItem seltime3;

    @FXML
    private Menu signout;

    @FXML
    private Button suborder;

    @FXML
    void CanOrder(ActionEvent event) {

    }

    @FXML
    void Dpicker(ActionEvent event) {

    }

    @FXML
    void FoodTyp(ActionEvent event) {

    }

    @FXML
    void Ok1(ActionEvent event) throws IOException {
        {
            System.out.println("HI");
            Parent blah = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) seltime.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }

    }

    @FXML
    void Ok2(ActionEvent event) {

    }

    @FXML
    void Ok3(ActionEvent event) {

    }

    @FXML
    void Ok4(ActionEvent event) {

    }

    @FXML
    void Pinfo(ActionEvent event) {

    }

    @FXML
    void ResMeal(ActionEvent event) {

    }

    @FXML
    void ReserveHis(ActionEvent event) {

    }

    @FXML
    void SelCheck(ActionEvent event) {

    }

    @FXML
    void SelTime1(ActionEvent event) {
        seltime.setText(seltime1.getText());

    }

    @FXML
    void SelTime2(ActionEvent event) {
        seltime.setText(seltime2.getText());

    }

    @FXML
    void SelTime3(ActionEvent event) {
        seltime.setText(seltime3.getText());

    }

    @FXML
    void SignOut(ActionEvent event) {

    }

    @FXML
    void SubOrder(ActionEvent event) {

    }

}
