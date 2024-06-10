package ExceptionHandling;

public class Exceptions {
    public static void main(String[] args) {
        try {                                                                       // Tries to execute a code block that might give rise to an exception.
            System.out.println("In \"try\" block.");
            int y = 10 / 5; // this will not throw any exception.
            System.out.println(y);
            int x = 5 / 0; // this will throw an ArithmeticException.
            System.out.println(x);
        } catch (ArithmeticException e) {                                           // Executed when an exception occurs.
            System.out.println("In \"catch\" block.");
            System.out.println("Exception message: " + e + ".");
        } finally {                                                                 // Executed regardless whether an exception has occurred or not.
            System.out.println("In \"finally\" block.");
            System.out.println("Finally block executed");
        }

    }
}
