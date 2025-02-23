package core2;
import java.util.Scanner;

public class UpdateArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        displayArray(array);

        System.out.print("Enter the element to be replaced: ");
        int oldElement = scanner.nextInt();
        System.out.print("Enter the new element: ");
        int newElement = scanner.nextInt();

        boolean isUpdated = updateElement(array, oldElement, newElement);

        if (isUpdated) {
            System.out.println("Updated array:");
            displayArray(array);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }

    public static boolean updateElement(int[] array, int oldElement, int newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
                return true; // Element found and updated
            }
        }
        return false; 
    }

    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
