package core;

import java.io.File;
import java.io.FilenameFilter;

public class FileExtensionFilter {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "C:\\Users\\priya\\Downloads"; // Change this to your directory path

        // Specify the extension to filter
        String extension = ".txt"; // Change this to the desired file extension

        // Get the directory as a File object
        File directory = new File(directoryPath);

        // Validate if the directory exists and is a directory
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified path is not a directory or does not exist.");
            return;
        }

        // Create a filename filter for the specified extension
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(extension.toLowerCase());
            }
        };

        // Get the list of files with the specified extension
        File[] files = directory.listFiles(filter);

        // Check if files are found
        if (files != null && files.length > 0) {
            System.out.println("Files with extension " + extension + ":");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("No files with extension " + extension + " found in the directory.");
        }
    }
}

