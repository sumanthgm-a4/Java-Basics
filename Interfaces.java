// Pure abstraction in interfaces

// All attributes in an interface are public, static and final by default
// All methods in an interface are public and abstract by default
interface Animal {
    void walk();
    // Animal() {       // No constructors in an interface
    // }

    // void eat() {
    //     System.out.println();    // No concrete methods in an interface
    // }

    // default void eat1() {
    //     System.out.println("Eating");
    // }

    // static void eat2() {
    //     System.out.println("Eating");    // Concrete methods allowed ONLY if they're default or static
    // }
}

interface  Herbivore {
    
}

// Interfaces allow multiple inheritance
// A class implementing an interface must implement all methods in it
// Except default and static methods
class Horse implements Animal, Herbivore {
    @Override
        public void walk() {
            System.out.println("Horse walks");
        }
}

public class Interfaces {
    
}
