package Collections.ComparableAndComaprators.Comparables;

import java.util.*;

class Animal implements Comparable<Animal> {                            // Objects of this class cannot be sorted without the class implemening the Comparable interface.
    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    // The compareTo() method has to be implemented after implementing the Comparable interface in the class.
    @Override
    public int compareTo(Animal that) {
        if (this.age == that.age) { return this.name.compareTo(that.name); }
        else if (this.name.equals(that.name)) { return (this.weight - that.weight); }
        return (this.age - that.age);
    }
}

public class LearnComparable {
    public static void main(String[] args) {
        Animal a1 = new Animal(4, "Leo", 10);
        Animal a2 = new Animal(4, "Bruno", 4);
        Animal a3 = new Animal(1, "Max", 6);
        Animal a4 = new Animal(3, "Don", 3);

        ArrayList<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        System.out.println("Before sorting: " + dogs);

        Collections.sort(dogs);
        System.out.println("After sorting: " + dogs);
    }
}
