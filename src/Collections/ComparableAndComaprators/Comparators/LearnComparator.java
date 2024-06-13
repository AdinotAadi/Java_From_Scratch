package Collections.ComparableAndComaprators.Comparators;

import java.util.*;

class Animal {
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
}

public class LearnComparator {
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

        Collections.sort(dogs, (d1, d2) -> d1.name.compareTo(d2.name));
        System.out.println("After sorting: " + dogs);
    }
}