package OOPs.OOPs2;

public class Bike extends Vehicle{
    void horn() {
        System.out.println("Peep peep.");
    }

    public Bike() {
        this.wheel_count = 2;
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println("A bike has " + b.wheel_count + " wheels.");
        b.horn();
        b.startEngine();
        b.rev();
        b.rev(7000);
    }
}
