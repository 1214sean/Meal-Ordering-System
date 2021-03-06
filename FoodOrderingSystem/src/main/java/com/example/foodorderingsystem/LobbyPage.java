package com.example.foodorderingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LobbyPage {

    private static final String COMMA_DELIMITER = ",";

    @FXML
    private Label Food_Item_01;

    @FXML
    private Label Food_Item_02;

    @FXML
    private Label Food_Item_03;

    @FXML
    private Label Food_Item_04;

    @FXML
    private TextArea ItemDiscript_01;

    @FXML
    private TextArea ItemDiscript_02;

    @FXML
    private TextArea ItemDiscript_03;

    @FXML
    private TextArea ItemDiscript_04;

    @FXML
    private ImageView Logo;

    @FXML
    private ImageView ItemPic_01;

    @FXML
    private ImageView ItemPic_02;

    @FXML
    private ImageView ItemPic_03;

    @FXML
    private ImageView ItemPic_04;

    @FXML
    private Label Price_01;

    @FXML
    private Label Price_02;

    @FXML
    private Label Price_03;

    @FXML
    private Label Price_04;

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
    private TextField orderstuclass;

    @FXML
    private TextField orderstuname;

    @FXML
    private Label RO_Item01;

    @FXML
    private Label RO_Item02;

    @FXML
    private Label RO_Item03;


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
    protected void initialize() {
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


        }System.out.println("helooloololololoolololoolo");


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
    void SelFood2(ActionEvent event) throws IOException {
        foodtyp.setText(food2.getText());
        List<List<String>> a=read_711();
        Food_Item_01.setText(a.get(0).get(0));
        Food_Item_02.setText(a.get(1).get(0));
        Food_Item_03.setText(a.get(2).get(0));
        Food_Item_04.setText(a.get(3).get(0));
        ItemDiscript_01.setText(a.get(0).get(1));
        ItemDiscript_02.setText(a.get(1).get(1));
        ItemDiscript_03.setText(a.get(2).get(1));
        ItemDiscript_04.setText(a.get(3).get(1));
        Price_01.setText(a.get(0).get(2)+"NTD");
        Price_02.setText(a.get(1).get(2)+"NTD");
        Price_03.setText(a.get(2).get(2)+"NTD");
        Price_04.setText(a.get(3).get(2)+"NTD");

        //String url = "https://www.recipetineats.com/wp-content/uploads/2014/07/Vietnamese-Rice-Paper-Rolls-7.jpg";\
        String url = a.get(0).get(3);
        Image image = new Image(url);
        ItemPic_01.setImage(image);

        String url2 = a.get(1).get(3);
        Image image2 = new Image(url2);
        ItemPic_02.setImage(image2);

        String url3 = a.get(2).get(3);
        Image image3 = new Image(url3);
        ItemPic_03.setImage(image3);

        String url4 = a.get(3).get(3);
        Image image4 = new Image(url4);
        ItemPic_04.setImage(image4);



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


        // ????????????????????? if else??? if ??????
        LocalDate date = dpicker.getValue();
        //System.out.println(date);
        String fti=seltime.getText();
        //System.out.println(fti);
        String fty=foodtyp.getText();
        //System.out.println(fty);
        String Local_T=LocalTime.now().toString();
        //System.out.println(Local_T);

        String stuname=orderstuname.getText();
        String stuclass=orderstuclass.getText();

        List<List<String>> b=read_studentOrder();
        List<String> c=new ArrayList<>();



        if(sel1.isSelected()||sel2.isSelected()|| sel3.isSelected()||sel4.isSelected()==true) {
            c.add(date.toString());
            c.add(fti);
            c.add(fty);
            c.add(stuname);
            c.add(stuclass);
            b.add(c);
            write_SO(b);
            suborder.setText("Submitted!!");
        }
        else {
            suborder.setText("Select Again");
        }



        //????????????
        List<List<String>> d=read_studentOrderItems();
        List<String> e=new ArrayList<>();

        if(sel1.isSelected()==true)
            e.add(Food_Item_01.getText());
        else {}


        if(sel2.isSelected()==true)
            e.add(Food_Item_02.getText());
        else {}


        if(sel3.isSelected()==true)
            e.add(Food_Item_03.getText());
        else {}

        if(sel4.isSelected()==true)
            e.add(Food_Item_04.getText());
        else {}

        d.add(e);
        write_SOI(d);


        //????????????

        List<List<String>> a=read_studentOrderPrice();
        List<String> x=new ArrayList<>();
        int total_price=0;

        if(sel1.isSelected()==true)
            total_price=Integer.parseInt(Price_01.getText().replaceAll("NTD",""));
        else {}


        if(sel2.isSelected()==true)
            total_price=total_price+Integer.parseInt(Price_02.getText().replaceAll("NTD",""));
        else {}


        if(sel3.isSelected()==true)
            total_price=total_price+Integer.parseInt(Price_03.getText().replaceAll("NTD",""));
        else {}

        if(sel4.isSelected()==true)
            total_price=total_price+Integer.parseInt(Price_04.getText().replaceAll("NTD",""));
        else {}

        String tp=String.valueOf(total_price);
        x.add(tp);
        a.add(x);
        write_SOP(a);





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

    private static List<List<String>> read_studentOrderItems() {

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

    private static List<List<String>> read_studentOrderPrice() {

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


    /*private static List<List<String>> read_three() {

        int x=0;

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Configs.base + "StudentOrder.csv"))) {
            String line;
            while ((line = br.readLine()) != null && x<3) {
                String[] values = line.split(COMMA_DELIMITER);
                records.add(Arrays.asList(values));
                x++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(records.toString());
        return records;
    }*/

    private static void write_SO(List<List<String>> data) {
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


