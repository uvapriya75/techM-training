package core2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericReverseList {
    
    
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<String> strList = List.of("grape", "banana", "cherry", "orange");
        
        System.out.println("Original Integer List: " + intList);
        System.out.println("Reversed Integer List: " + reverseList(intList));
        
        System.out.println("Original String List: " + strList);
        System.out.println("Reversed String List: " + reverseList(strList));
    }
}
