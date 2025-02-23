import java.util.Objects;

public class EqualsVsDeepEquals {
    public static void main(String[] args) {
        // Comparing simple objects
        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println("Objects.equals: " + Objects.equals(str1, str2)); 
        System.out.println("Objects.deepEquals: " + Objects.deepEquals(str1, str2));

        // Comparing arrays 
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};

        System.out.println("Objects.equals: " + Objects.equals(arr1, arr2)); 
        System.out.println("Objects.deepEquals: " + Objects.deepEquals(arr1, arr2)); 
    }
}
