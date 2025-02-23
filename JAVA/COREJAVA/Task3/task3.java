import java.io.File;
import java.util.Scanner;

public class FileExistenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();
        
        File file = new File(path);
        
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The specified path exists and it is a file.");
            } else if (file.isDirectory()) {
                System.out.println("The specified path exists and it is a directory.");
            }
        } else {
            System.out.println("The specified file or directory does not exist.");
        }
        
        scanner.close();
    }
}
