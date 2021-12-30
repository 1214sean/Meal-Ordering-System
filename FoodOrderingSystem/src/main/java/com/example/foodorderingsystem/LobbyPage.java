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

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LobbyPage {

    private static final String COMMA_DELIMITER = ",";

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
    private MenuItem food1;

    @FXML
    private MenuItem food2;

    @FXML
    private MenuItem food3;

    @FXML
    private MenuItem food4;



    @FXML
    private Menu signout;

    @FXML
    private Button suborder;



    @FXML
    void CanOrder(ActionEvent event) {
        sel1.setSelected(false);
        sel2.setSelected(false);
        sel3.setSelected(false);
        sel4.setSelected(false);

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
    void Ok2(ActionEvent event) throws IOException {

        List<List<String>> a;

        {
            System.out.println("HI");
            Parent blah = FXMLLoader.load(getClass().getResource("ReserveHis.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) seltime.getScene().getWindow();
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

            Stage appStage = (Stage) seltime.getScene().getWindow();
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

            Stage appStage = (Stage) seltime.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }

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
    void SelTime(ActionEvent event) {


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
    void SelFood1(ActionEvent event) {
        foodtyp.setText(food1.getText());


    }

    @FXML
    void SelFood2(ActionEvent event) {
        foodtyp.setText(food2.getText());

    }

    @FXML
    void SelFood3(ActionEvent event) {
        foodtyp.setText(food3.getText());

    }

    @FXML
    void SelFood4(ActionEvent event) {
        foodtyp.setText(food4.getText());

    }




    @FXML
    void SignOut(ActionEvent event) {

    }

    @FXML
    void SubOrder(ActionEvent event) {
        LocalDate date = dpicker.getValue();
        System.out.println(date);
        String fti=seltime.getText();
        System.out.println(fti);
        String fty=foodtyp.getText();
        System.out.println(fty);

        List<List<String>> a=read();
        List<String> x=new ArrayList<>();

        x.add(date.toString());
        x.add(fti);
        x.add(fty);

        a.add(x);
        write(a);

        // 到時候整個寫到 if else的 if 裏面





        if(sel1.isSelected()||sel2.isSelected()|| sel3.isSelected()||sel4.isSelected()==true) {


            suborder.setText("Submitted!!");
        }
        else {
            suborder.setText("Select Again");
        }










    }

    private static List<List<String>> read() {

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/sean/Documents/GitHub/Meal-Ordering-System/FoodOrderingSystem/src/main/java/com/example/foodorderingsystem/StudentOrder.csv"))) {
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

    private static void write(List<List<String>> data) {
        String ans = "";
        for(int i = 0; i < data.size(); i++) {
            for(int j = 0; j < data.get(i).size(); j++) {
                ans += String.valueOf(data.get(i).get(j));
                if(j != data.get(i).size() - 1) ans += ",";
            }
            if(i != data.size() - 1) ans += "\n";
        }
        System.out.print(ans);

        try {
            FileWriter myWriter = new FileWriter("/Users/sean/Documents/GitHub/Meal-Ordering-System/FoodOrderingSystem/src/main/java/com/example/foodorderingsystem/StudentOrder.csv");
            myWriter.write(ans);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }










}


