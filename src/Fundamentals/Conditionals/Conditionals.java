package Fundamentals.Conditionals;

public class Conditionals {
    public static void main(String[] args) {
        int age = 20;

        // if statement
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // if-else statement
        age = 16;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }

        // if-else-if ladder
        int score = 75;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // switch statement
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        age = 20;
        String message = (age >= 18) ? "You are an adult." : "You are not an adult.";
        System.out.println(message);
    }
}
