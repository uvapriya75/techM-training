package core;

import java.io.File;

public class FileSizeExample {
    public static void main(String[] args) {
        // Specify the file path
        String filePath ="C:\\Users\\uva\\OneDrive\\Documents\\photo\\uvaa.jpg";// Change this to your file path

        // Create a File object
        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            // Get file size in bytes
            long fileSizeInBytes = file.length();

            // Convert bytes to KB and MB
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;

            // Print file sizes
            System.out.println("File Size in Bytes: " + fileSizeInBytes);
            System.out.println("File Size in KB: " + String.format("%.2f", fileSizeInKB));
            System.out.println("File Size in MB: " + String.format("%.2f", fileSizeInMB));
        } else {
            System.out.println("File does not exist or is not a valid file.");
        }
    }
}

