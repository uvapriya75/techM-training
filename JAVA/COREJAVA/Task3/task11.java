package core;

import java.io.*;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\uva\\OneDrive\\Documents\\photo\\uvaa.jpg";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
