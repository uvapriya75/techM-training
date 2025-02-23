package core2;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
      
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original LinkedList: " + list);

        int elementToAdd = 40;
        list.addLast(elementToAdd);

        System.out.println("LinkedList after inserting element at the end: " + list);
    }
}
