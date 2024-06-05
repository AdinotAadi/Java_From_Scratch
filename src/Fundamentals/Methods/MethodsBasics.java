package Fundamentals.Methods;

import java.util.Scanner;

public class MethodsBasics {
    // Method without parameter:
    public static void Greet() {
        System.out.println("Hello");
    }

    // Method with one parameter:
    public static void Greet(String name) {
        System.out.println("Hello, " + name);
    }
    // The above example also demonstrates method overloading.

    // Recursive methods:
    public static long factorial(int n) {
        if (n == 0 || n == 1) { return 1; }
        else { return n * factorial(n - 1); }
    }
    public static void main(String[] args) {
        Greet();
        Greet("Aditya");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print the factorial of: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n) + ".");
    }
}
