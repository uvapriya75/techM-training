package core2;
import java.util.LinkedList;

public class LinkedListOccurrences {
    public static void main(String[] args) {
        LinkedList<String> pets = new LinkedList<>();
        
        // Adding elements to the linked list
        pets.add("Dog");
        pets.add("Cat");
        pets.add("Rabbit");
        pets.add("Cat");
        pets.add("Parrot");
        pets.add("Cat");
        pets.add("Hamster");
        
        String target = "Cat";
        
        // Finding first and last occurrence
        int firstIndex = pets.indexOf(target);
        int lastIndex = pets.lastIndexOf(target);
        
        // Displaying results
        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + target + "' is at index: " + firstIndex);
            System.out.println("Last occurrence of '" + target + "' is at index: " + lastIndex);
        } else {
            System.out.println("Element '" + target + "' not found in the list.");
        }
    }
}
