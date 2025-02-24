package core2;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(27, 45, 78, 90, 34, 12);

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
       
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
      
        min.ifPresent(value -> System.out.println("Minimum value: " + value));
        max.ifPresent(value -> System.out.println("Maximum value: " + value));
    }
}
