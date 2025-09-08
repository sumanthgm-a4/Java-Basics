public class Sample2 {
    public static void main(String[] args) {
        // try {
        //     level1();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        level1();       // No try-catch leads to stack trace -> detailed info about the calls which gave the exception
        
    }

    // NullPointerException, ArithmeticException, etc. are unchecked exceptions
    // They're not checked for during compile-time

    // FileNotFoundException, etc. are checked exceptions
    // They're checked during the compile-time itself

    public static void level3() {
        int[] array = new int[5];
        array[5] = 10;
    }

    public static void level2() {
        level3();
    }

    public static void level1() {
        level2();
    }
}
