package core2;
import java.util.LinkedList;

public class LinkedListIteration {
    public static void main(String[] args) {
    
        LinkedList<String> list = new LinkedList<>();
   
        list.add("Dog");
        list.add("Cat");
        list.add("Rabbit");
        list.add("Parrot");
        list.add("Hamster");
       
        System.out.println("Iterating using for-each loop:");
        for (String pet : list) {
            System.out.println(pet);
        }
   
        System.out.println("\nIterating using Iterator:");
        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
       
        System.out.println("\nIterating using for loop with get():");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        // Iterating using forEach() method (Java 8+)
        System.out.println("\nIterating using forEach() method:");
        list.forEach(System.out::println);
    }
}
