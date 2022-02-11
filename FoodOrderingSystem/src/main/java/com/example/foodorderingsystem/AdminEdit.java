package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdminEdit {

    private static final String COMMA_DELIMITER = ",";

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
        if(foodtyp.getText()=="7-11") {
            List<List<String>> a = read_711();
            a.get(0).set(0, item1.getText());
            a.get(0).set(1, food_des1.getText());
            a.get(0).set(2, price1.getText());
            a.get(0).set(3, url1.getText());
            a.get(1).set(0, item2.getText());
            a.get(1).set(1, food_des2.getText());
            a.get(1).set(2, price2.getText());
            a.get(1).set(3, url2.getText());
            a.get(2).set(0, item3.getText());
            a.get(2).set(1, food_des3.getText());
            a.get(2).set(2, price3.getText());
            a.get(2).set(3, url3.getText());
            a.get(3).set(0, item4.getText());
            a.get(3).set(1, food_des4.getText());
            a.get(3).set(2, price4.getText());
            a.get(3).set(3, url4.getText());
            write_711(a);
        }
    }


    private static List<List<String>> read_711() {

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Configs.base + "7-11.csv"))) {
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

    private static void write_711(List<List<String>> data) {
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
            FileWriter myWriter = new FileWriter(Configs.base + "7-11.csv");
            myWriter.write(ans);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

}
