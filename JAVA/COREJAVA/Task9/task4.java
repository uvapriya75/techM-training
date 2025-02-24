package core2;


import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateelements {
    public static void main(String[] args) {
        //  list with duplicate elements
        List<Integer> numbers = Arrays.asList(78, 2, 3, 45, 5, 2, 3, 6, 7, 8, 8, 9);

        // Remove duplicates
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

    // Print
        System.out.println("List without duplicates: " + uniqueNumbers);
    }
}
