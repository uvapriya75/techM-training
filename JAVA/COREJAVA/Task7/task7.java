package core2;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchArrayList {
    public static void main(String[] args) {
       
        ArrayList<Integer> numbers = new ArrayList<>();
        
   
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements you want to add:");
        int n = scanner.nextInt();
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
       
        System.out.println("Enter the element to search:");
        int searchElement = scanner.nextInt();
        
        if (numbers.contains(searchElement)) {
            System.out.println("Element " + searchElement + " found at index: " + numbers.indexOf(searchElement));
        } else {
            System.out.println("Element " + searchElement + " not found in the list.");
        }
        
        scanner.close();
    }
}
