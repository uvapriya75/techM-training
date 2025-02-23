package core;

import java.io.File;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "C:\\Users\\uva\\OneDrive\\Desktop"; // Change this path as needed

        // Create a File object
        File directory = new File(directoryPath);

        // Check if the given path is a directory
        if (directory.isDirectory()) {
            // Get list of all files and directories
            String[] fileList = directory.list();

            if (fileList != null) {
                System.out.println("Files and directories in " + directoryPath + ":");
                for (String fileName : fileList) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("The directory is empty or an error occurred.");
            }
        } else {
            System.out.println("The specified path is not a directory.");
        }
    }
}

