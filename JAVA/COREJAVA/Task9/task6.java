package core2;
import java.util.*;
import java.util.stream.Collectors;

public class StringSorter {
    public static void main(String[] args) {
        List<String> pets = Arrays.asList("dog", "cat", "parrot", "rabbit", "hamster", "goldfish");

      
        List<String> ascendingOrder = pets.stream()
                                           .sorted()
                                           .collect(Collectors.toList());
        
      
        List<String> descendingOrder = pets.stream()
                                            .sorted(Comparator.reverseOrder())
                                            .collect(Collectors.toList());
      
        System.out.println("Original List: " + pets);
        System.out.println("Ascending Order: " + ascendingOrder);
        System.out.println("Descending Order: " + descendingOrder);
    }
}
