class Shape {
    String color;
    int sides;

    public void area() {
        System.out.println("Displays area");
    }
}

class Traingle extends Shape {
    public void area(int b, int h) {
        System.out.println((1/2) * b * h);
    }
}

class EqTriangle extends Traingle {
    public void area() {
        System.out.println("Equilateral traingle area");
    }
}

class Circle extends Shape {
    public void area() {
        System.out.println("Circle area");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Traingle t1 = new Traingle();
        t1.color = "Red";
        t1.sides = 3;

        System.out.println(t1.color);
    }
}
