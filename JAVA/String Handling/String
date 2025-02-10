package abc;
public class StringProcessor {

   
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

 
    public int countOccurrences(String text, String sub) {
        if (sub.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

  
    public String splitAndCapitalize(String str) {
        String[] words = str.split(" ");
        StringBuilder capitalizedString = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedString.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }
        return capitalizedString.toString().trim();
    }

    
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();

        String testString = "hello world";
        System.out.println("Reversed: " + processor.reverseString(testString));

        String text = "hello hello world hello";
        String sub = "hello";
        System.out.println("Occurrences: " + processor.countOccurrences(text, sub));

        System.out.println("Capitalized: " + processor.splitAndCapitalize(testString));
    }
}

