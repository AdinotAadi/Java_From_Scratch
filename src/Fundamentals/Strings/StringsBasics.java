package Fundamentals.Strings;

public class StringsBasics {
    public static void main(String[] args) {
        // Creating strings
        String greeting = "Hello, World!";
        String anotherGreeting = new String("Hello, World!");

        // String concatenation
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2; // Using +
        String result2 = str1.concat(" ").concat(str2); // Using concat()

        // String length
        String str = "Hello, World!";
        int length = str.length(); // length is 13

        // Accessing characters
        char firstChar = str.charAt(0); // firstChar is 'H'

        // Comparing strings
        boolean isEqual = greeting.equals(anotherGreeting); // true
        int compareResult = str1.compareTo(str2); // negative value because "Hello" comes before "World" lexicographically

        // String formatting
        String formattedString = String.format("The value of pi is approximately %.2f", Math.PI);

        // Printing results
        System.out.println("String: " + greeting);
        System.out.println("Another String: " + anotherGreeting);
        System.out.println("Concatenated String: " + result);
        System.out.println("Concatenated String (using concat()): " + result2);
        System.out.println("Length of String: " + length);
        System.out.println("First Character of String: " + firstChar);
        System.out.println("Are the strings equal? " + isEqual);
        System.out.println("Comparison Result: " + compareResult);
        System.out.println("Formatted String: " + formattedString);
    }
}
