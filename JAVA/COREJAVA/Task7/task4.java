package core2;
import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElement {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
         list.add("Bella");
        list.add("Charlie");
        list.add("Luna");
        list.add("Max");
        list.add("Bailey");
        
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index to retrieve element: ");
        int index = scanner.nextInt();
        scanner.close();
      
        if (index >= 0 && index < list.size()) {
            System.out.println("Element at index " + index + ": " + list.get(index));
        } else {
            System.out.println("Invalid index! Please enter a value between 0 and " + (list.size() - 1));
        }
    }
}
