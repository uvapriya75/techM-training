package core2;
import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
      
        ArrayList<String> list = new ArrayList<>();
        list.add("Rose");
        list.add("Lily");
        list.add("Tulip");
        list.add("Daisy");
        list.add("Orchid");

        System.out.println("Original list: " + list);

        if (list.size() > 2) {
            list.remove(2);
        }

        System.out.println("List after removing third element: " + list);
    }
}
