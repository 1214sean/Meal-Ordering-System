package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private DatePicker cal;

    @FXML
    private Label idn;

    @FXML
    private Label reo;

    @FXML
    private Label studi;

    @FXML
    private Label rm;

    @FXML
    private ImageView pic1;

    @FXML
    private ImageView pic2;

    @FXML
    private TextArea it1;

    @FXML
    private TextArea it2;

    @FXML
    private Label so;

    @FXML
    private TextArea itinfo1;

    @FXML
    private TextArea itinfo2;

    @FXML
    private CheckBox s1;

    @FXML
    private CheckBox s2;

    @FXML
    private ScrollBar sb;

    @FXML
    private void initialize() {
        idn.setText("81XW31");
        it1.setText("Spaghetti01");
    }

    @FXML
    private void submit(){
        it1.setText("Spaghetti!!!!!!!");
    }  //define submit function


}