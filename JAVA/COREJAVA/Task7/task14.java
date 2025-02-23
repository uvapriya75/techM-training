package core2;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
      
        LinkedList<String> pets = new LinkedList<>();
        pets.add("Dog");
        pets.add("Cat");
        pets.add("Rabbit");
        pets.add("Parrot");
 ListIterator<String> iterator = pets.listIterator(pets.size());
      System.out.println("Pets in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
