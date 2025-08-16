import java.util.Stack;

public class StackAddExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Add (push) elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Print the stack
        System.out.println("Stack after adding elements: " + stack);
    }
}
