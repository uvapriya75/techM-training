package core;
import java.util.Arrays;
public class AlternateElements {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        //  size of the new array
        int newSize = (originalArray.length + 1) / 2;
        int[] newArray = new int[newSize];

        // Copy alternate elements
        int index = 0;
        for (int i = 0; i < originalArray.length; i += 2) {
            newArray[index++] = originalArray[i];
        }

        //  new array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array with Alternate Elements: " + Arrays.toString(newArray));
    }
}


