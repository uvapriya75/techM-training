package core2;

import java.io.*;

public class FileReaderExample {

    // Method to read a file and throw an exception if the file is not found
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            readFile("C:\\Users\\uva\\OneDrive\\Documents\\photo\\uvaa.jpg"); 
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

