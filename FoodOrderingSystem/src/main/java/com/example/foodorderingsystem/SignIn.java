package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SignIn {

    private static final String COMMA_DELIMITER = ",";

    @FXML
    private PasswordField account;

    @FXML
    private CheckBox adminb;

    @FXML
    private Button login;

    @FXML
    private PasswordField pass;

    @FXML
    private Button resetpass;

    @FXML
    private CheckBox userb;

    @FXML
    void ResetPass(ActionEvent event) {
        account.setText("");
        pass.setText("");
        adminb.setSelected(false);
        userb.setSelected(false);

    }

    @FXML
    void enterlobby(ActionEvent event) throws IOException {


        List<List<String>> a=read();
        String AuthenAccount=account.getText();
        String Authenpassword=pass.getText();
        boolean allowlogin=false;

        System.out.println(a.get(0).get(0));
        System.out.println(AuthenAccount );
        System.out.println(a.get(0).get(1));
        System.out.println(Authenpassword);

        if (a.get(0).get(0).equals(AuthenAccount) && a.get(0).get(1).equals(Authenpassword)) {

            allowlogin=true;

        } else{}



            if(userb.isSelected()==true && allowlogin==true ) {
                Parent blah = FXMLLoader.load(getClass().getResource("LobbyPage.fxml"));
                Scene scene = new Scene(blah);

                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(scene);
                appStage.show();
            }
            else if (allowlogin==true){
                Parent blah = FXMLLoader.load(getClass().getResource("AdminEdit.fxml"));
                Scene scene = new Scene(blah);

                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(scene);
                appStage.show();

            }else{}


    }

    private static List<List<String>> read() {

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Configs.base + "AccountPass.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                records.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(records.toString());
        return records;
    }





}

