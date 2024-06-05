package Fundamentals.Strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // charAt
        char ch = str.charAt(1);
        System.out.println("charAt(1): " + ch);

        // compareTo
        int result = str.compareTo("Hello");
        System.out.println("compareTo(\"Hello\"): " + result);

        // concat
        String str2 = str.concat(" Welcome!");
        System.out.println("concat(\" Welcome!\"): " + str2);

        // contains
        boolean contains = str.contains("World");
        System.out.println("contains(\"World\"): " + contains);

        // endsWith
        boolean endsWith = str.endsWith("!");
        System.out.println("endsWith(\"!\"): " + endsWith);

        // equals
        boolean equals = str.equals("Hello, World!");
        System.out.println("equals(\"Hello, World!\"): " + equals);

        // equalsIgnoreCase
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("equalsIgnoreCase(\"hello, world!\"): " + equalsIgnoreCase);

        // indexOf
        int indexOf = str.indexOf('o');
        System.out.println("indexOf('o'): " + indexOf);

        // lastIndexOf
        int lastIndexOf = str.lastIndexOf('o');
        System.out.println("lastIndexOf('o'): " + lastIndexOf);

        // length
        int length = str.length();
        System.out.println("length(): " + length);

        // replace
        String replacedStr = str.replace('o', 'a');
        System.out.println("replace('o', 'a'): " + replacedStr);

        // split
        String[] splitStr = str.split(", ");
        System.out.println("split(\", \"): " + java.util.Arrays.toString(splitStr));

        // substring
        String substring = str.substring(7);
        System.out.println("substring(7): " + substring);

        // toLowerCase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("toLowerCase(): " + lowerCaseStr);

        // toUpperCase
        String upperCaseStr = str.toUpperCase();
        System.out.println("toUpperCase(): " + upperCaseStr);

        // trim
        String strWithSpaces = "   Hello, World!   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("trim(): '" + trimmedStr + "'");

        // valueOf
        int number = 123;
        String numberStr = String.valueOf(number);
        System.out.println("valueOf(123): " + numberStr);
    }
}
