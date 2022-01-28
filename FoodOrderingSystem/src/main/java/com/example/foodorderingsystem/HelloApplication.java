package com.example.foodorderingsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        String StudentO_relative_path = Configs.base + "StudentOrder.csv";
        String AccountPass_relative_path = Configs.base + "AccountPass.csv";
        String Orderviewi_relative_path = Configs.base + "orderview_commun_i.csv";

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AdminEdit.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}