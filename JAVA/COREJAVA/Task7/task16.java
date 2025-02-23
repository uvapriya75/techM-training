package core2;
import java.util.LinkedList;

public class LinkedListInsertion {
    public static void main(String[] args) {
    
        LinkedList<String> list = new LinkedList<>();
   
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        System.out.println("Original LinkedList: " + list);
      
        list.addFirst("Mango");
    
        list.addLast("Orange");
        
        System.out.println("Updated LinkedList: " + list);
    }
}
