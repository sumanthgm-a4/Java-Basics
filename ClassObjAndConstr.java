class Pen {
    String color;
    String type;    // Ballpoint or Gel

    // Constructors are of two types
    // 1. Non-parameterized
    // 2. Parameterized

    // 1. Non-parameterized constructor
    Pen() {
        System.out.println("Constructor is called");
    }

    // 2. Parameterized constructor
    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    // Copy constructor
    Pen(Pen pen2) {
        this.color = pen2.color;
        this.type = pen2.type;
    }

    public void write() {
        System.out.println("Writing...");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

// Automatic Desctructor in Java - Automatic garbage collection
// Destrcutors is not written in Java

public class ClassObjAndConstr {
    public static void main(String[] args) {
        Pen pen1 = new Pen();       // Non-parameterized constructor
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen("Red", "Ballpoint");     // Parameterized constructor
        pen2.printColor();

        Pen pen3 = new Pen(pen2);       // Copy constructor
        pen3.printColor();
    }
}