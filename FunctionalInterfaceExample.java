
// 1. Normal Interface - with multiple methods (abstract or concrete)
// 2. Functional Interface - with SAM (Single Abstract Method)
// 3. Marker Interfaces - no methods i.e., empty interfaces

@FunctionalInterface
interface A {
    void show();
}

// Type-1
// class B implements A {
//     public void show() {
//         System.out.println("HELLO");
//     }
// }

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Type-1
        // A obj = new B();
        // obj.show();

        // Type-2
        // A obj = new A() {
        //     public void show() {
        //         System.out.println("HELLO");
        //     }
        // };
        // obj.show();

        // Type-3: Lambda Expressions
        // A obj = () -> { 
        //     System.out.println("HELLO"); 
        // };
        // OR
        A obj = () -> System.out.println("HELLO");  // No need for {} if there's only one statement
        obj.show();

        // This creates an anonymous file of the class which implements the interface, in the background
    }
}
