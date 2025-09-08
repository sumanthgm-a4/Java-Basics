// <T> - Type Parameter
// <T extends SomeClass> - Bounded Generic i.e. only children of SomeClass can be given
// Bounded Generics can be used with interfaces too
// <T extends SomeClass & SomeInterface1 & SomeInterface2> - valid 

public class CustomPrinter <T> {
    // Integer thingToPrint;    // Instead of declaring a single class, use Generics
    T thingToPrint;

    public CustomPrinter(T something) {     // Generic type
        this.thingToPrint = something;
    }

    public void print() {
        System.out.println(this.thingToPrint);
    }
}
