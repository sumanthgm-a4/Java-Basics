import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeues {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Add front & back
        deque.addFirst("Front");
        deque.addLast("Back");

        System.out.println(deque);

        // Peek
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        // Remove
        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);
    }
}
