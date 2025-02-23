package core2;
import java.util.*;

public class CopyArrayList {
    public static void main(String[] args) {
      
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");
        
     
        ArrayList<String> list2 = new ArrayList<>(list1.size());
        
       
        for (int i = 0; i < list1.size(); i++) {
            list2.add(null);
        }

        Collections.copy(list2, list1);
        
     
        System.out.println("Original ArrayList (list1): " + list1);
        System.out.println("Copied ArrayList (list2): " + list2);
    }
}
