package core;

import java.io.*;
import java.nio.file.*;

public class FileToByteArray {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\uva\\OneDrive\\Documents\\photo\\uvaa.jpg"; 

        try {
            byte[] fileData = readFileToByteArray(filePath);
            System.out.println("File read successfully. Byte array length: " + fileData.length);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public static byte[] readFileToByteArray(String filePath) throws IOException {
        return Files.readAllBytes(Paths.get(filePath));
    }
}
