import java.util.LinkedList;
import java.util.Queue;

public class QueueDeleteExample {
    public static void main(String[] args) {
        // Create a queue of integers
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Initial Queue: " + queue);

        // Remove elements from the queue
        int removedElement = queue.remove(); // removes head of the queue
        System.out.println("Removed Element: " + removedElement);

        // Queue after deletion
        System.out.println("Queue after deletion: " + queue);

        // Using poll() (does the same, but returns null if queue is empty)
        int polledElement = queue.poll();
        System.out.println("Polled Element: " + polledElement);
        System.out.println("Queue after polling: " + queue);
    }
}
