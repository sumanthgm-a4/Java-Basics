
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BuiltInInterfaces {
    public static void main(String[] args) {
        // Fucntion<T, R> takes T as input and return R; method is .apply()
        Function<Integer, String> intToStr = i -> "" + i;   

        // Consumer<T> takes T input and returns nothing; method is .accept()
        Consumer<String> appendHello = s -> System.out.println(s + " hello");

        // Supplier<T> takes no input and returns R; method is .get()
        Supplier<String> sayHello = () -> "Hello from supplier";

        // Predicate<T> takes T input and returns boolean; method is .test()
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // UnaryOperator is a Function where input and output are the same type;
        // method is .apply()
        UnaryOperator<Integer> square = n -> n * n;
        
        // BinaryOperator is a BiFunction where both inputs and output are the same type;
        // method is .apply()
        BinaryOperator<Integer> multiply = (a, b) -> a * b;


        // Examples
        System.out.println(intToStr.apply(50));
        appendHello.accept("Sumanth");
        System.out.println(sayHello.get());
        System.out.println(isEven.test(21));
        System.out.println(square.apply(12));
        System.out.println(multiply.apply(5, 6));
    }
}
