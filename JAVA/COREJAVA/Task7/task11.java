package core2;
import java.util.LinkedList;

public class AppendToLinkedList {
    public static void main(String[] args) {
    
        LinkedList<String> pets = new LinkedList<>();
        
        pets.add("Dog");
        pets.add("Cat");
        pets.add("Rabbit");
     
        System.out.println("LinkedList before appending: " + pets);
       
        pets.addLast("Parrot");
     
        System.out.println("LinkedList after appending: " + pets);
    }
}
