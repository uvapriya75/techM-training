package core2;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListInsertion {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
     
        list.add(80);
        list.add(20);
        list.add(50);
        list.add(40);
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();
        
        System.out.print("Enter the position to insert the element: ");
        int position = scanner.nextInt();
    
        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position. Please enter a valid index.");
        } else {
            list.add(position, element);
            System.out.println("Updated LinkedList: " + list);
        }
        
        scanner.close();
    }
}
