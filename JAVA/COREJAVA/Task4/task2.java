package core2;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberChecker {
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
        int testNumber = 7; // Change this value to test
        try {
            checkEven(testNumber);
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

