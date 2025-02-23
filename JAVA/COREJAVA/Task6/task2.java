package core2;
import java.util.*;

public class GenericSearch {
   
    public static <T> int findFirstIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i; // Return the index of the first occurrence
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
       
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 2, 5);
        System.out.println("Index of 2 in intList: " + findFirstIndex(intList, 2));
        
        List<String> strList = Arrays.asList("apple", "banana", "cherry", "banana");
        System.out.println("Index of 'banana' in strList: " + findFirstIndex(strList, "banana"));
        
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 2.2);
        System.out.println("Index of 2.2 in doubleList: " + findFirstIndex(doubleList, 2.2));
    }
}
