// Generics don't work for primitive types - int, float, double, etc.
// Use Integer, Float, Double, etc. instead

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        CustomPrinter<Integer> printer1 = new CustomPrinter<>(23);
        printer1.print();   // CustomPrinter for an Integer

        CustomPrinter<String> printer2 = new CustomPrinter<>("Sumanth");
        printer2.print();   // CustomPrinter for a String

        // Generic Method
        shout("Sum", "ABC");
        shout(21, "Hello");

        // Wildcards in generics
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(4);
        printList(intList);
    }

    // Generic Method
    public static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + " " + otherThingToShout + "!!!!!");
    }

    // To return a Generic Type just say for example:
    // public static <A, B> A method() {...}

    // Wildcards
    // Method to print any type of list
    // private static void printList(List<Object> myList) {
    //     System.out.println(myList);
    // }  
    // Doesn't work cuz though Integer is a subclass of Object, List<Integer> is not 
    // a subclass of List<Object>
    // '?' ==> Wildcard
    private static void printList(List<?> myList) {
        System.out.println(myList);
    }
    // <? extends SomeClass> - Bounded Wildcard is valid too
}
