package OOPs.OOPs2;

public class Truck extends Vehicle{
    public Truck() {
        this.wheel_count = 6;
    }

    public static void main(String[] args) {
        Truck t = new Truck();
        System.out.println("A truck has " + t.wheel_count + " wheels.");
        t.horn();
        t.startEngine();
        t.rev();
        t.rev(4000);
    }
}
