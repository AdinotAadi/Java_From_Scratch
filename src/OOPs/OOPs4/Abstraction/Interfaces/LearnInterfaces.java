package OOPs.OOPs4.Abstraction.Interfaces;

public class LearnInterfaces {
    public static void main(String[] args) {
        Dog d = new Dog("Bruno");
        d.eats();
        d.eats("Steak");
        d.walks();
        d.walks(1000);
        d.plays();
        d.talks();
    }
}

interface Animal {
    void eats();
    void walks();
}

interface Pet {
    void talks();
    void plays();
}

class Dog implements Animal, Pet {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eats() {
        System.out.println(name + " eats.");
    }

    public void eats(String food) {
        System.out.println(name + " eats " + food + ".");
    }

    @Override
    public void walks() {
        System.out.println(name + " walks.");
    }

    public void walks(int steps) {
        System.out.println(name + " walked " + steps + " steps.");
    }

    @Override
    public void talks() {
        System.out.println(name + " talks.");
    }

    @Override
    public void plays() {
        System.out.println(name + " plays.");
    }
}

