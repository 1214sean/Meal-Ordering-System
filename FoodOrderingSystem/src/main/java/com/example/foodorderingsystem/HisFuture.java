package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HisFuture {

    private static final String COMMA_DELIMITER = ",";


    @FXML
    private Label Item1;

    @FXML
    private Label date;

    @FXML
    private Button delete_order;

    @FXML
    private MenuItem ok1;

    @FXML
    private MenuItem ok2;

    @FXML
    private MenuItem ok3;

    @FXML
    private MenuItem ok4;

    @FXML
    private Label ordernum;

    @FXML
    private Label time;

    @FXML
    private Label totalprice;




    @FXML
    protected void initialize() {
        int b=readcommu_i();
        List<String> c=read_specificOrder(b);
        //  id.settext(c.get(0))
        date.setText(c.get(0)); //only 一維List of String
        time.setText(c.get(1));


        List<String> d=read_specificOrderItems(b);
        int dsize=d.size();
        String buyitems="";
        for(int i =0;i<dsize;i++)
            buyitems=buyitems+" "+d.get(i);
        Item1.setText(buyitems);

        List<String> e=read_specificOrderPrice(b);
        totalprice.setText(e.get(0)+" NTD");







    }

    @FXML
    protected void Delete_Order() throws IOException {

        List<List<String>> b = read_StudentOrder(); //讀取原本資料
        List<List<String>> c = Deleting(b);//刪資料
        write_StudentOrder(c);



        List<List<String>> x = read_SOI(); //讀取原本資料
        List<List<String>> y = Deleting(x);
        write_SOI(y);


        List<List<String>> e = read_SOP(); //讀取原本資料
        List<List<String>> f = Deleting(e);
        write_SOP(f);



        System.out.println("HI");
        Parent blah = FXMLLoader.load(getClass().getResource("ReserveHis.fxml"));
        Scene scene = new Scene(blah);

        Stage appStage = (Stage) delete_order.getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
        //replacing the original order with deleted order

        // NEED another line to go back to  the previous page
    }

    @FXML
    void Ok1(ActionEvent event) throws IOException {
        {
            System.out.println("HI");
            Parent blah = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
            Scene scene = new Scene(blah);

            Stage appStage = (Stage) delete_order.getScene().getWindow();
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

            Stage appStage = (Stage) delete_order.getScene().getWindow();
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

            Stage appStage = (Stage) delete_order.getScene().getWindow();
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

            Stage appStage = (Stage) delete_order.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }

    }

    private static List<List<String>> read_StudentOrder() {

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

    private static List<List<String>> read_SOI() {

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Configs.base + "StudentOrderItems.csv"))) {
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

    private static List<List<String>> read_SOP() {

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Configs.base + "StudentOrderPrice.csv"))) {
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
        try (BufferedReader br = new BufferedReader(new FileReader(Configs.base + "orderview_commun_i.csv"))) {
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


    private List<String> read_specificOrderItems(int b) {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Configs.base + "StudentOrderItems.csv"))) {
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


    private List<String> read_specificOrderPrice(int b) {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Configs.base + "StudentOrderPrice.csv"))) {
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

    private static void write_StudentOrder(List<List<String>> data) {
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

    private static void write_SOI(List<List<String>> data) {
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
            FileWriter myWriter = new FileWriter(Configs.base + "StudentOrderItems.csv");
            myWriter.write(ans);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

    private static void write_SOP(List<List<String>> data) {
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
            FileWriter myWriter = new FileWriter(Configs.base + "StudentOrderPrice.csv");
            myWriter.write(ans);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }




}
