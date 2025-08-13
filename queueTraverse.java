
import java.util.LinkedList;
import java.util.Queue;

public class queueTraverse {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Mango");

        // Traversing the queue using for-each loop
        System.out.println("Traversing using for-each loop:");
        for (String item : queue) {
            System.out.println(item);
        }

        // Traversing using while loop and iterator
        System.out.println("\nTraversing using while loop:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Removes and returns head
        }
    }
}
