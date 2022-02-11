package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AdminEdit {

    @FXML
    private MenuItem food2;

    @FXML
    private MenuItem food3;

    @FXML
    private MenuItem food4;

    @FXML
    private TextArea food_des1;

    @FXML
    private TextArea food_des2;

    @FXML
    private TextArea food_des3;

    @FXML
    private TextArea food_des4;

    @FXML
    private MenuButton foodtyp;

    @FXML
    private TextField item1;

    @FXML
    private TextField item2;

    @FXML
    private TextField item3;

    @FXML
    private TextField item4;

    @FXML
    private MenuItem ok1;

    @FXML
    private MenuItem ok2;

    @FXML
    private MenuItem ok3;

    @FXML
    private MenuItem ok4;

    @FXML
    private TextField price1;

    @FXML
    private TextField price2;

    @FXML
    private TextField price3;

    @FXML
    private TextField price4;

    @FXML
    private Button save;

    @FXML
    private TextField url1;

    @FXML
    private TextField url2;

    @FXML
    private TextField url3;

    @FXML
    private TextField url4;

    @FXML
    void Food2(ActionEvent event) {
        foodtyp.setText("7-11");

    }

    @FXML
    void Food3(ActionEvent event) {
        foodtyp.setText("Court1");

    }

    @FXML
    void Food4(ActionEvent event) {
        foodtyp.setText("Court2");

    }

    @FXML
    void FoodTyp(ActionEvent event) {

    }

    @FXML
    void Ok1(ActionEvent event) {

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
    void Save(ActionEvent event) {
        String a= item1.getText();


    }

}
