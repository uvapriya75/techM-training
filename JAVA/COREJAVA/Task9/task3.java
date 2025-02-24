package core2;
import java.util.Arrays;
import java.util.List;

public class EvenOdd {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 38, 94, 56, 6, 7, 8, 9, 10);
        
        int sumOfEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        int sumOfOdds = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        //results
        System.out.println("Sum of even numbers: " + sumOfEvens);
        System.out.println("Sum of odd numbers: " + sumOfOdds);
    }
}
