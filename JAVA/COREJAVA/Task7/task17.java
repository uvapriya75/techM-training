package core2;
import java.util.LinkedList;

public class LinkedListInsertFront {
    public static void main(String[] args) {
   
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original LinkedList: " + list);

        int newElement = 5;
        list.addFirst(newElement);

        System.out.println("LinkedList after inserting at front: " + list);
    }
}
