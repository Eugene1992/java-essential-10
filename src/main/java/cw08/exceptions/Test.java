package cw08.exceptions;

import java.io.*;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
//        System.out.println(10 / 0); // ArithmeticException <unchecked>
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/temp.txt")); // FileNotFoundException <checked>
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            readFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            f();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void f() throws FileNotFoundException, SQLException {
        readFromFile();
    }

    public static void readFromFile() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("C:/temp.txt")); // FileNotFoundException <checked>
    }
}
