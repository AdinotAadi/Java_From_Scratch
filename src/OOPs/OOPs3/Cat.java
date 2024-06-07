package OOPs.OOPs3;

public class Cat extends Animal {
    public void sound() { System.out.println("Cat meows"); }
    public void sleep() { System.out.println("Cat sleeps"); }
    public void play() { System.out.println("Cat plays"); }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
//        c.eat();                                                        // Cannot find symbol.
        c.sleep();
        c.play();
    }
}