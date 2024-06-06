package OOPs.OOPs2;

public class Car extends Vehicle{

    void horn() {
        System.out.println("Honk honk.");
    }

    public Car() {
        this.wheel_count = 4;
    }

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("A car has " + c.wheel_count + " wheels.");
        c.horn();
        c.startEngine();
        c.rev();
        c.rev(6500);
    }
}
