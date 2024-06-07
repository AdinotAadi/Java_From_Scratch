package OOPs.OOPs3.PackageBasics;                   // Current package.

import java.util.Scanner;                           // Importing the Scanner class from the java.util package.
import OOPs.OOPs3.PackageBasics.Person;

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Scanner sc = new Scanner(System.in);
        t.name = sc.next();
        t.teach();
        System.out.println(t.age);                  // Private access modifier on "age" attribute.
        sc.close();
    }
}
