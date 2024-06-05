package Fundamentals.Arrays;

import java.util.Arrays;

public class ArraysBasics {public static void main(String[] args) {
    // Declaration with specific size
    int[] numbers = new int[5];
    System.out.println("numbers: " + Arrays.toString(numbers));

    // Declaration with initial values
    int[] nums = {6, 7, 8, 9};
    System.out.println("nums: " + Arrays.toString(nums));

    // 2D array
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("matrix: " + Arrays.deepToString(matrix));
}
}

/*
 * Without ".toString()":
 * numbers: [I@119d7047
 * nums: [I@776ec8df
 * matrix: [[I@3b07d329
 * With ".toString()":
 * numbers: [0, 0, 0, 0, 0]
 * nums: [6, 7, 8, 9]
 * matrix: [[I@4c873330, [I@119d7047, [I@776ec8df]
 * With ".toString()" and "deepToString()":
 * numbers: [0, 0, 0, 0, 0]
 * nums: [6, 7, 8, 9]
 * matrix: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
 */
