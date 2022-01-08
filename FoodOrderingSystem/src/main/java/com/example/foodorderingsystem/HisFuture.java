package com.example.foodorderingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HisFuture {
    private static final String COMMA_DELIMITER = ",";


    @FXML
    private Label date;

    @FXML
    private Label time;





    @FXML
    protected void initialize() {
        int b=readcommu_i();
        List<String> c=read_specificOrder(b);
        //  id.settext(c.get(0))
        date.setText(c.get(0)); //only 一維List of String
        time.setText(c.get(1));



    }




    private static int readcommu_i() {

        String aggregated = "";
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/sean/Documents/GitHub/Meal-Ordering-System/FoodOrderingSystem/src/main/java/com/example/foodorderingsystem/orderview_commun_i.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                aggregated += line;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(aggregated);
        int a=Integer.parseInt(aggregated);
        return a;

    }


    private List<String> read_specificOrder(int b) {
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


        List<String> specificorder= records.get(b);
        return specificorder;
    }
}
