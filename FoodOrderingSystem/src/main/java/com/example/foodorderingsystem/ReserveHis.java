package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReserveHis {

    private static final String COMMA_DELIMITER = ",";

    @FXML
    private Button futureok;

    @FXML
    private MenuItem ok1;

    @FXML
    private MenuItem ok2;

    @FXML
    private MenuItem ok3;

    @FXML
    private MenuItem ok4;

    @FXML
    private MenuButton viewfuture;

    @FXML
    private MenuItem viewfuture1;

    @FXML
    private MenuItem viewfuture2;

    @FXML
    private MenuButton viewpast;

    @FXML
    private MenuItem viewpast1;

    @FXML
    private MenuItem viewpast2;



    @FXML
    protected void initialize() {
        System.out.println("RESERVEHISSS!!!!");
        //read();
        //List<List<String>> a=read();
        //write(a);
        //changeviewfuture1(a);        //第一種改menuiten name 的方式


        List<List<String>> reserve=read();
        for( int i=0; i<reserve.size();i++)
        {
            String c=reserve.get(i).get(0)+reserve.get(i).get(1)+reserve.get(i).get(2);
            MenuItem item=new MenuItem(c);
            viewfuture.getItems().add(item);
            final int i_final = i;
            item.setOnAction(event -> orderClicked(event, i_final));

        } //自動生成menuitem + 更新menu item name


    }

    @FXML
    int orderClicked(ActionEvent event, int i) {
        System.out.println(i);
        write_i(i);


        return i;
    }

    @FXML
    void FutureOk(ActionEvent event) throws IOException {
        System.out.println("HI");
        Parent blah = FXMLLoader.load(getClass().getResource("HisFuture.fxml"));
        Scene scene = new Scene(blah);

        Stage appStage = (Stage) futureok.getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();

    }
    @FXML
    void Ok1(ActionEvent event) throws IOException
        {
            System.out.println("HI");
            Parent blah = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) futureok.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }

    @FXML
    void Ok2(ActionEvent event) throws IOException
        {
            System.out.println("HI");
            Parent blah = FXMLLoader.load(getClass().getResource("ReserveHis.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) futureok.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }

    @FXML
    void Ok3(ActionEvent event) throws IOException
        {
            System.out.println("HI");
            Parent blah = FXMLLoader.load(getClass().getResource("PersonInfo.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) futureok.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }

    @FXML
    void Ok4(ActionEvent event) throws IOException
        {
            System.out.println("HI");
            Parent blah = FXMLLoader.load(getClass().getResource("LobbyPage.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) futureok.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }

    @FXML
    void ViewFuture(ActionEvent event) {




    }

    @FXML
    void ViewFuture1(ActionEvent event) {


    }

    @FXML
    void ViewFuture2(ActionEvent event) {

    }

    @FXML
    void ViewPast(ActionEvent event) {

    }

    @FXML
    void ViewPast1(ActionEvent event) {

    }

    @FXML
    void ViewPast2(ActionEvent event) {

    }

    private static List<List<String>> read() {

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



    /*private static void write(List<List<String>> data) {
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
            FileWriter myWriter = new FileWriter("/Users/sean/Documents/GitHub/Meal-Ordering-System/FoodOrderingSystem/src/main/java/com/example/foodorderingsystem/writtest.csv");
            myWriter.write(ans);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    } */

    private void changeviewfuture1(List<List<String>> data) {
        String ans = "";
        for(int i = 0; i < data.size(); i++) {
            for(int j = 0; j < data.get(i).size(); j++) {
                ans += String.valueOf(data.get(i).get(j));
                if(j != data.get(i).size() - 1) ans += ",";
            }
            if(i != data.size() - 1) ans += "\n";
            viewfuture1.setText(ans);
        }



    }

    private static void write_i(int i) {
        System.out.println(i);

        try {
            FileWriter myWriter = new FileWriter(Configs.base + "orderview_commun_i.csv"); //communicate between new developed menuitem and HisFuture.fxml
            myWriter.write(java.lang.String.valueOf(i));
            myWriter.flush();
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }




}
