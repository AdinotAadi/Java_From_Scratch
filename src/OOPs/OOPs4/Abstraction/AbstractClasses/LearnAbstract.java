package OOPs.OOPs4.Abstraction.AbstractClasses;

public class LearnAbstract {
    public static void main(String[] args) {
//        Vehicle v = new Vehicle();                     // Will not work, as Vehicle class is abstract.
        Car c = new Car();
        c.horn();
        c.breakWheels();
        System.out.println(c.getClassType());
        Truck t = new Truck();
        t.horn();
        t.breakWheels();
        System.out.println(t.getClassType());
    }
}

abstract class Vehicle {
    abstract void horn();
    abstract void breakWheels();
    String getClassType() {
        return "Vehicle";
    }
}

class Car extends Vehicle {
    @Override                                           // Simply an annotation, mainly used to check for spelling mistakes in the implementation of abstract methods.
    void horn() {
        System.out.println("Beep Beep.");
    }

    @Override                                           // Simply an annotation, mainly used to check for spelling mistakes in the implementation of abstract methods.
    void breakWheels() {
        System.out.println("The car is breaking.");
    }
}

class Truck extends Vehicle {
    @Override                                           // Simply an annotation, mainly used to check for spelling mistakes in the implementation of abstract methods.
    void horn() {
        System.out.println("Honk Honk.");
    }
    @Override                                           // Simply an annotation, mainly used to check for spelling mistakes in the implementation of abstract methods.
    void breakWheels() {
        System.out.println("The truck is breaking.");
    }
}
