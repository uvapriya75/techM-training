package core;
import java.io.File;
import java.util.Scanner;

public class FilePermissionChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for file or directory path
        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();

        // Create a File object
        File file = new File(path);

        // Check if the file/directory exists
        if (!file.exists()) {
            System.out.println("The specified file or directory does not exist.");
        } else {
            // Check read and write permissions
            System.out.println("Read permission: " + file.canRead());
            System.out.println("Write permission: " + file.canWrite());
        }

        scanner.close();
    }
}

