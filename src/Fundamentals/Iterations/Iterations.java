package Fundamentals.Iterations;

public class Iterations {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("while loop:");
        while (i < 5) {
            System.out.println("i is: " + i);
            i++;
        }

        // do-while loop
        int j = 0;
        System.out.println("\ndo-while loop:");
        do {
            System.out.println("j is: " + j);
            j++;
        } while (j < 5);

        // for loop
        System.out.println("\nfor loop:");
        for (int k = 0; k < 5; k++) {
            System.out.println("k is: " + k);
        }

        // enhanced for loop (for-each loop)
        System.out.println("\nenhanced for loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("number is: " + number);
        }
    }
}
