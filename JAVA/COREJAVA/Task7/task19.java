package core2;
import java.util.LinkedList;

public class InsertInLinkedList {
    public static void main(String[] args) {
     
        LinkedList<String> list = new LinkedList<>();
      
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
     
        System.out.println("Original LinkedList: " + list);
        
        int position = 1; // Insert at index 1
        String newElement = "Mango";
        
        if (position >= 0 && position <= list.size()) {
            list.add(position, newElement);
            System.out.println("LinkedList after insertion: " + list);
        } else {
            System.out.println("Invalid position");
        }
    }
}
