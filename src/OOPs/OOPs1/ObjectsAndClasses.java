package OOPs.OOPs1;

public class ObjectsAndClasses {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Tommy", "White", 2);

        d1.bark();
        d1.eat();
        d1.eat("Fish");
        d1.walk();
        d1.walk(1000);

        d2.bark();
        d2.eat();
        d2.eat("Steak");
        d2.walk();
        d2.walk(5000);
    }
}

class Dog {
    String name;
    String color;
    int age;

    void bark() {
        System.out.println(name + " is barking.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    void walk() {
        System.out.println(name + " walked a few steps.");
    }

    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps.");
    }

    public Dog() {
        this.name = "Doggo";
        this.color = "Brown";
        this.age = 1;
    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}

/*
* This program demonstrates:
    * Classes
    * Objects
    * Instance variables
    * Constructors
    * Constructor overloading
    * Method overloading
*/