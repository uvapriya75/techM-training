package core2;
import java.util.ArrayList;

public class InsertElement {
    public static void main(String[] args) {
    
        ArrayList<String> list = new ArrayList<>();
       
        list.add("Lion");
        list.add("Tiger");
        list.add("Elephant");
        
       
        System.out.println("Original List: " + list);
        
       
        list.add(0, "Zebra");
        
        System.out.println("Updated List: " + list);
    }
}
