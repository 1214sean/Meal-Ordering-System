import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        write();
        read();



    }

    private static void read() {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/sean/Documents/GitHub/Meal-Ordering-System/CSVtest/src/book.csv"))) {
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
    }


    private static void write() {
        int[][] data = {{1, 2}, {3, 4}};
        String ans = "";
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                ans += String.valueOf(data[i][j]);
                if(j != data[i].length - 1) ans += ",";
            }
            if(i != data.length - 1) ans += "\n";
        }
        System.out.print(ans);

        try {
            FileWriter myWriter = new FileWriter("/Users/sean/Documents/GitHub/Meal-Ordering-System/CSVtest/src/book.csv");
            myWriter.write(ans);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }




}

