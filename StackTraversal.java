import java.util.Stack;

public class StackTraversal {
    public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();

        // Push elements into the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Mango");

        // Traversing the stack using for-each loop
        System.out.println("Traversing using for-each loop:");
        for (String item : stack) {
            System.out.println(item);
        }

        // Traversing from top to bottom using index
        System.out.println("\nTraversing from top to bottom:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}
