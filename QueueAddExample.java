import java.util.LinkedList;
import java.util.Queue;

public class QueueAddExample {
    public static void main(String[] args) {
        // Create a queue of integers
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // Print the queue
        System.out.println("Queue after adding elements: " + queue);
    }
}
