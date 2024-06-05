package Fundamentals.Variables;

public class Variables {
    public static void main(String[] args) {
        // Primitive Data types:
            // Numeric Data Types:
        byte a = 10;
        short b = 5000;
        int c = 100000;
        long d = 100000L;
        float e = 234.5f;
        double f = 123.4;

            // Non-numeric Data Types:
        boolean g = true;
        char h = 'A';

        // Non-primitive Data Types:
        String str = "Hello, World!";
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("byte value: " + a);
        System.out.println("short value: " + b);
        System.out.println("int value: " + c);
        System.out.println("long value: " + d);
        System.out.println("float value: " + e);
        System.out.println("double value: " + f);
        System.out.println("boolean value: " + g);
        System.out.println("char value: " + h);
        System.out.println("String value: " + str);
        System.out.print("Array values: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
