package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ReserveHis {

    private static final String COMMA_DELIMITER = ",";


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
    private Button pastok;

    @FXML
    private MenuButton viewfuture;



    @FXML
    private MenuButton viewpast;



    @FXML
    int orderClicked(ActionEvent event, int i) {
        System.out.println(i);
        write_i(i);


        return i;
    }

    @FXML
    protected void initialize() {
        System.out.println("RESERVEHISSS!!!!");
        //read();
        //List<List<String>> a=read();
        //write(a);
        //changeviewfuture1(a);        //第一種改menuiten name 的方式
        List<List<String>> reserve=read();
        Collections.sort(reserve, new CustomComparator());

        viewfuture.getItems().clear();
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter_date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(date.format(formatter_date));
        String comparedate= date.format(formatter_date);

        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter_time = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(time.format(formatter_time));
        String comparetime=time.format(formatter_time);

        int i;

        for( i=0; i<reserve.size();i++) {
            if (
                    (comparedate.compareTo(reserve.get(i).get(0)) < 0) ||
                            (comparedate.compareTo(reserve.get(i).get(0)) == 0 && comparetime.compareTo("12:30:00") < 0)
            ) {
                break;
            }

        }




        for( int j=0; j<i;j++)
        {
            String c=reserve.get(j).get(0)+reserve.get(j).get(1)+reserve.get(j).get(2);
            MenuItem item=new MenuItem(c);
            viewpast.getItems().add(item);
            final int j_final_past =j;
            item.setOnAction(event -> orderClicked(event, j_final_past)); //onAction pragmtically by using anomynomus  fuciton when click the certain vie future order, it atomaticlly writes into the gile of which intend to open


        }
        for( int j=i; j<reserve.size();j++)
        {
            String c=reserve.get(j).get(0)+reserve.get(j).get(1)+reserve.get(j).get(2);
            MenuItem item=new MenuItem(c);
            viewfuture.getItems().add(item);
            final int j_final_future =j;
            item.setOnAction(event -> orderClicked(event, j_final_future));

        }





        //自動生成menuitem + 更新menu item name



        List<List<String>> a=read_studentOrder();
        if (a.size()==0) {

        }else if (a.size()==1){
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
    void PastOk(ActionEvent event) {

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

    /*private void changeviewfuture1(List<List<String>> data) {
        String ans = "";
        for(int i = 0; i < data.size(); i++) {
            for(int j = 0; j < data.get(i).size(); j++) {
                ans += String.valueOf(data.get(i).get(j));
                if(j != data.get(i).size() - 1) ans += ",";
            }
            if(i != data.size() - 1) ans += "\n";
            viewfuture1.setText(ans);
        }



    } */

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


class CustomComparator implements Comparator<List<String>> //判斷日期順序 整理資料排列從最新到最舊
{
    @Override
    public int compare(List<String> o1,
                       List<String> o2) {
        String firstString_o1 = o1.get(0);
        String firstString_o2 = o2.get(0);
        String firstString_o3 = o1.get(1);
        String firstString_o4 = o2.get(1);

        if (firstString_o1.compareTo(firstString_o2) < 0 ||
                firstString_o1.compareTo(firstString_o2) == 0 && firstString_o3.compareTo(firstString_o4) < 0)
            return -1;
        else return 1;

    }




}
