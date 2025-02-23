package core;

import java.io.File;
import java.util.Scanner;

public class PathChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  input
        System.out.print("Enter the pathname: ");
        String path = scanner.nextLine();

        // Create File object
        File file = new File(path);

        // Check if the file/directory 
        if (!file.exists()) {
            System.out.println("The specified path does not exist.");
        } else if (file.isFile()) {
            System.out.println("The given pathname is a file.");
        } else if (file.isDirectory()) {
            System.out.println("The given pathname is a directory.");
        } else {
            System.out.println("Unknown type.");
        }

        scanner.close();
    }
}

