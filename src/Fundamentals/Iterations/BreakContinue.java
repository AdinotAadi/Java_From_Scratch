package Fundamentals.Iterations;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Using break:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // Exit the loop when i is 5
            }
            System.out.println("i: " + i);
        }

        // Using continue in a for loop
        System.out.println("\nUsing continue:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skip the rest of the loop body if i is even
            }
            System.out.println("i: " + i);
        }

        // Using break in a while loop
        System.out.println("\nUsing break in a while loop:");
        int j = 0;
        while (j < 10) {
            if (j == 5) {
                break;  // Exit the loop when j is 5
            }
            System.out.println("j: " + j);
            j++;
        }

        // Using continue in a while loop
        System.out.println("\nUsing continue in a while loop:");
        int k = 0;
        while (k < 10) {
            k++;
            if (k % 2 == 0) {
                continue;  // Skip the rest of the loop body if k is even
            }
            System.out.println("k: " + k);
        }
    }
}
