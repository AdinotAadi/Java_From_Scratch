package Fundamentals.Arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 2, 8, 1, 9};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Search for an element in the array
        int searchKey = 8;
        int index = Arrays.binarySearch(numbers, searchKey);
        if (index >= 0) {
            System.out.println("Element " + searchKey + " found at index " + index);
        } else {
            System.out.println("Element " + searchKey + " not found");
        }

        // Fill the array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // Copy a portion of the array
        int[] copiedArray = Arrays.copyOf(numbers, 3);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Check if two arrays are equal
        int[] anotherArray = {5, 2, 8, 1, 9};
        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));
        boolean isEqual = Arrays.equals(numbers, anotherArray);
        System.out.println("Are numbers and anotherArray equal? " + isEqual);
    }
}