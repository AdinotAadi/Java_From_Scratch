package OOPs.OOPs2;

public class Vehicle {
    int wheel_count;

    void startEngine() {
        System.out.println("The engine is running.");
    }

    void rev() {
        System.out.println("The engine was revved up.");
    }

    void rev(int rpm) {
        System.out.println("The engine was revved up to " + rpm + " rpm.");
    }

    void horn() {
        System.out.println("The horn was used.");
    }
}

/*
* This is a parent class that is extended/inherited by the following classes:
    * Car: Overrides some functions, sets the wheel count to 4.
    * Bike Overrides some functions, sets the wheel count to 2.
    * Truck: Inherits functions from the parent class, sets the wheel count to 6.
*/
