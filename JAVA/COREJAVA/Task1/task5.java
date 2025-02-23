package core;

public class AlternateCapitalization {
    public static void main(String[] args) {
        String input = "uvapriya";
        String output = alternateCapitalize(input);
        System.out.println(output);
    }

    public static String alternateCapitalize(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                result.append(Character.toLowerCase(str.charAt(i)));
            }
        }

        return result.toString();
    }
}

