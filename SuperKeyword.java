// "super" keyword is used to access things from the parent class from a child class
// 1. "super" to call parent methods
// 2. "super()" to call parent constructor

class Animal {
    int age;
    String name;

    public Animal() {
        System.out.println("This is the Animal's constructor");
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Animal is making some noise...");
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }
}

// "super()" can be used only in the child's constructor
// "super()", if used, must be the first statement in the child's constructor
// If there's no "super()" in the child, Java calls the parent's 
// no args constructor implicityly
class Cat extends Animal {
    String catFoodPreference;

    public Cat() {
        // super();     // redundant here, as a child class calls parent's constructor implicitly
        System.out.println("This is the Cat's constructor");
    }

    public Cat(int age, String name, String catFoodPreference) {
        // this.age = age;
        // this.name = name;
        super(age, name);       // super class's constructor
        this.catFoodPreference = catFoodPreference;
    }
    
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Cat is meowing...");
        // super.eat();
        eat();  // "super" is not needed cuz Cat is not implementing the "eat()" method
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Cat cat = new Cat(12, "Bobcat", "Fish");
        System.out.println(cat.name);
        System.out.println(cat.catFoodPreference);
        cat.makeNoise();
    }
}
