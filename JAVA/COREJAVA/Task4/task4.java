package core2;

import java.io.*;
import java.util.*;

// Custom exception for positive numbers
class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

public class CheckNegativeNumbers {
    public static void main(String[] args) {
        String filename = "C:\\Users\\uva\\OneDrive\\Documents\\photo\\uvaa.jpg"; 

        try {
            checkNumbers(filename);
            System.out.println("All numbers are non-positive.");
        } catch (PositiveNumberException e) {
            System.err.println("Exception: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        }
    }

    public static void checkNumbers(String filename) throws IOException, PositiveNumberException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double num = scanner.nextDouble();
                if (num > 0) {
                    scanner.close();
                    throw new PositiveNumberException("Positive number found: " + num);
                }
            } else {
                scanner.next();
            }
        }

        scanner.close();
    }
}

