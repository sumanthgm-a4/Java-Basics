
import java.io.FileNotFoundException;
import java.io.FileReader;

// "throws" just tells that a specified Exception might occur due to it
// and that it's the caller's duty to handle that Exception

// "throw" is used to forcefully throw a new Exception

public class ThrowsDeclaration {
    public static void main(String[] args) throws FileNotFoundException {
        method2();
    }

    public static void method2() throws RuntimeException {
        method1();
    }

    public static void method1() throws RuntimeException {
        try {
            FileReader fileReader = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            throw new RuntimeException("Oopsie");
        } finally {     // "finally" block ALWAYS executes
            System.out.println("Hello");
        }
    }
}
