import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        stack.push("EDF5");

        System.out.println(stack.search("DOOM")); // Returns the index of the item searched.
        System.out.println(stack.peek()); // Lets you peak at the top of the stack.
        System.out.println(stack);        // Shows all the stack items.

        // Uses of stacks?
        // 1. undo/redo features in text edits
        // 2. moving back/forward through browser history.
        // 3. backtracking algorithms (max, file directories)
        // 4. calling functions (call stack)
    }
}