# Introduction to Java

## About Java
- Java is a general purpose, high-level, object-oriented programming language. It was developed by James Gosling at Sun Microsystems, in 1993
- Following are the 5 principles of the Java programming language:
  - It must be simple, object-oriented and familiar.
  - It must be robust and secure.
  - It must be architecture-neutral and portable.
  - It must execute with high performance.
  - It must be interpreted, threaded and dynamic.
- Why is java so popular?
  - Platform independence.
  - Fundamentally object-oriented.
  - Easy to learn.
  - Versatile.
- Use cases of Java:
  - Building android apps.
  - Java web applications.
  - Software tools.
  - Scientific applications.

## First program in Java:
```java
public class Hello {
    public static void main(String[] args) {
        System.out.print("Hello, World!");
    }
}
```
- Each and every java program has to be written inside a class, as it is one of the main principles of object-oriented programming that Java strictly follows.
- The `main` is the entry point of every Java program.
- The statement `System.out.print()` is used to print/output to the console, as it is. However, the `System.out.println()` statement is used to print/output to the console, after which a newline character is also printed.
- Every statement has to be terminated by a `;`, else an error is generated.