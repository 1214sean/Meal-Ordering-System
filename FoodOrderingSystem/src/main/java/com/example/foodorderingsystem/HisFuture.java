package com.example.foodorderingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.*;
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
    private Button delete_order;




    @FXML
    protected void initialize() {
        int b=readcommu_i();
        List<String> c=read_specificOrder(b);
        //  id.settext(c.get(0))
        date.setText(c.get(0)); //only 一維List of String
        time.setText(c.get(1));



    }

    @FXML
    protected void Delete_Order() {

        List<List<String>> b = read(); //讀取原本資料
        List<List<String>> c = Deleting(b);
        write(c); //replacing the original order with deleted order

        // NEED another line to go back to  the previous page
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








    private static int readcommu_i() {

        String aggregated = "";
        try (BufferedReader br = new BufferedReader(new FileReader(Configs.base + "orderview_commun_i.csv.csv"))) {
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


        List<String> specificorder= records.get(b);
        return specificorder;
    }

    protected List<List<String>> Deleting(List<List<String>> a) {
        int c = readcommu_i();
        List<List<String>> records2 = new ArrayList<>();
        for (int x = 0; x < a.size(); x++) {
            if (x == c) {
                continue;
            }
            records2.add(a.get(x));
        }
        System.out.println(records2.toString());
        return records2;
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
            FileWriter myWriter = new FileWriter(Configs.base + "StudentOrder.csv");
            myWriter.write(ans);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }




}
