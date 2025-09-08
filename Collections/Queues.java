
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add / Offer
        queue.add("A");
        queue.offer("B");

        System.out.println(queue);

        // Peek (view head without removing)
        System.out.println(queue.peek());

        // Remove / Poll (remove head)
        System.out.println(queue.remove());
        System.out.println(queue.poll());

        // Empty?
        System.out.println(queue.isEmpty());
    }
}
