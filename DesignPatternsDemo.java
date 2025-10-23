
// ================= Builder Pattern =================
class Pizza {
    private String dough;
    private String topping;

    public void setDough(String dough) { this.dough = dough; }
    public void setTopping(String topping) { this.topping = topping; }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough and " + topping + " topping";
    }
}

class PizzaBuilder {
    private Pizza pizza = new Pizza();

    public PizzaBuilder setDough(String dough) {
        pizza.setDough(dough);
        return this;
    }

    public PizzaBuilder setTopping(String topping) {
        pizza.setTopping(topping);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}

// ================= Prototype Pattern =================
class Sheep implements Cloneable {
    private String name;

    public Sheep(String name) { this.name = name; }
    public String getName() { return name; }
    public void setName(String name ) {this.name = name;}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Sheep: " + name;
    }
}

// ================= Singleton Pattern =================
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
    public void showMessage() {
        System.out.println("Singleton instance here!");
    }
}

// ================= Factory Method Pattern =================
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() { System.out.println("Drawing Circle"); }
}

class Square implements Shape {
    public void draw() { System.out.println("Drawing Square"); }
}

class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
}

// ================= Main Class =================
public class DesignPatternsDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("=== Builder Pattern ===");
        Pizza pizza = new PizzaBuilder().setDough("Thin Crust").setTopping("Cheese").build();
        System.out.println(pizza);

        System.out.println("\n=== Prototype Pattern ===");
        Sheep original = new Sheep("Dolly");
        Sheep clone = (Sheep) original.clone();
        clone.setName("Lucy");
        System.out.println(original);
        System.out.println(clone);

        System.out.println("\n=== Singleton Pattern ===");
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        System.out.println("\n=== Factory Method Pattern ===");
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("CIRCLE");
        Shape shape2 = factory.getShape("SQUARE");
        shape1.draw();
        shape2.draw();
    }
}
