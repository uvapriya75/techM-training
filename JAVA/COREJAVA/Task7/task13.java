package core2;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {
    public static void main(String[] args) {
     
        LinkedList<String> pets = new LinkedList<>();
        pets.add("Dog");
        pets.add("Cat");
        pets.add("Rabbit");
        pets.add("Hamster");
        pets.add("Parrot");

    
        int startPosition = 2;
        if (startPosition < 0 || startPosition >= pets.size()) {
            System.out.println("Invalid start position");
            return;
        }

        ListIterator<String> iterator = pets.listIterator(startPosition);

        System.out.println("Iterating from position " + startPosition + ":");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
