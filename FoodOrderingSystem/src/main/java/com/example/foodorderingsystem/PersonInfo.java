package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonInfo {

    private static final String COMMA_DELIMITER = ",";

    @FXML
    private ImageView Logo;

    @FXML
    private Label RO_Date01;

    @FXML
    private Label RO_Date02;

    @FXML
    private Label RO_Date03;

    @FXML
    private ImageView RO_Image01;

    @FXML
    private ImageView RO_Image02;

    @FXML
    private ImageView RO_Image03;

    @FXML
    private Label RO_Item01;

    @FXML
    private Label RO_Item02;

    @FXML
    private Label RO_Item03;

    @FXML
    private Button reportE;

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
    private Menu signout;

    @FXML
    protected void initialize() {
        List<List<String>> a=read_studentOrder();
        if (a.size()==1){
            RO_Item01.setText(String.valueOf(a.get(0).get(2)));
            RO_Date01.setText(String.valueOf(a.get(0).get(0)));

        }else if (a.size()==2){
            RO_Item01.setText(String.valueOf(a.get(0).get(2)));
            RO_Date01.setText(String.valueOf(a.get(0).get(0)));
            RO_Item02.setText(String.valueOf(a.get(1).get(2)));
            RO_Date02.setText(String.valueOf(a.get(1).get(0)));
        }else{
            RO_Item01.setText(String.valueOf(a.get(a.size()-1).get(2)));
            RO_Date01.setText(String.valueOf(a.get(a.size()-1).get(0)));
            RO_Item02.setText(String.valueOf(a.get(a.size()-2).get(2)));
            RO_Date02.setText(String.valueOf(a.get(a.size()-2).get(0)));
            RO_Item03.setText(String.valueOf(a.get(a.size()-3).get(2)));
            RO_Date03.setText(String.valueOf(a.get(a.size()-3).get(0)));

        }




    }

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
    void Ok3(ActionEvent event) throws IOException{

        {
            System.out.println("HI");
            Parent blah = FXMLLoader.load(getClass().getResource("PersonInfo.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) reportE.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }

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

    private static List<List<String>> read_studentOrder() {

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Configs.base + "StudentOrder.csv"))) {
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
