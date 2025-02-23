package core2;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        
        ArrayList<String> pets = new ArrayList<>();
        pets.add("Dog");
        pets.add("Cat");
        pets.add("Rabbit");
        pets.add("Parrot");

        System.out.println("Using a for loop:");
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i));
        }

     
        System.out.println("\nUsing an enhanced for loop:");
        for (String pet : pets) {
            System.out.println(pet);
        }

       
        System.out.println("\nUsing an Iterator:");
        Iterator<String> iterator = pets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       System.out.println("\nUsing forEach method:");
        pets.forEach(System.out::println);
    }
}
