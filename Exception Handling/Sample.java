// Exception handling is the handling of run-time errors so that the flow of 
// the program is not interrupted

// Exception is an event which disturbs the normal flow of the program
// It is an object thrown during the run-time

public class Sample {
    public static void main(String[] args) {
        int[] numerators = {10, 20, 40, 30};
        int[] denominatiors = {1, 2, 0, 4};

        for (int i = 0; i < numerators.length; i++) {
            System.out.println(divide(numerators[i], denominatiors[i]));
        }
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e);
            return -1;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            return -1;
        } 
    }
}

