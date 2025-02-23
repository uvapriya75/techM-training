package core2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConverter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        
        // Convert to uppercase
        List<String> upperCaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        System.out.println("Uppercase: " + upperCaseWords);
        
        // Convert to lowercase
        List<String> lowerCaseWords = words.stream()
                                           .map(String::toLowerCase)
                                           .collect(Collectors.toList());
        System.out.println("Lowercase: " + lowerCaseWords);
    }
}
