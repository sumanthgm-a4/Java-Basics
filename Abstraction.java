// The concept of hiding the unnecessary implementation details from the user
// And showing only what's relevant to the user

// Two methods to implement abstraction:
// 1. Abstract classes
// 2. Interfaces


// 1. Abstract class

abstract class Animal {
    // Abstract Method
    abstract void walk();   // Only function declaration, no definition

    // Concrete Method
    public void eats() {    // Abstract class can have abstract and concrete methods
        System.out.println("Animal eats");
    } 

    // Constructors can be defined too
    Animal() {
        System.out.println("New Animal is created");
    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("New Horse is created");
    }

    @Override
    public void walk() {
        System.out.println("Walks on four legs...");
    }
}

class Chicken extends Animal {
    @Override
    public void walk() {
        System.out.println("Walks on two legs...");
    }
}

// Here Animal is irrelevant to the user, only Horse and Chicken matter

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eats();

        // Animal animal = new Animal();    // Error -> Abstract class can't be instantitated
    }
}
