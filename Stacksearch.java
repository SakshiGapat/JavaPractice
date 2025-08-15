import java.util.Stack;

public class Stacksearch {
    public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();

        // Push elements into the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Mango");

        // Element to search
        String searchElement = "Cherry";

        // Using search() method
        int position = stack.search(searchElement);

        if (position != -1) {
            System.out.println(searchElement + " found at position: " + position + " from the top");
        } else {
            System.out.println(searchElement + " not found in the stack.");
        }
    }
}
