package core2;
import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
       
        System.out.println("Original List: " + list);
       
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
    }
}
