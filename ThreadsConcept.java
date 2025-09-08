
import java.util.Scanner;

// Threading => Run multiple tasks simultaneously
// Improve the performance of time-consuming tasks like:
// i. File I/O
// ii. Network Communications
// iii. Background tasks

// Ways to create a thread
// Option 1. Extend the Thread class (simpler)
// Option 2. Implement the Runnable interface (better)

// 2. Using the Runnable interface
public class ThreadsConcept {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // MyRunnable myRunnable = new MyRunnable();
        // Thread thread = new Thread(myRunnable);

        Thread thread = new Thread(new MyRunnable());

        thread.setDaemon(true);     // Daemon threads end when the main thread ends
        thread.start();

        System.out.println("10 secs to enter the name");

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
