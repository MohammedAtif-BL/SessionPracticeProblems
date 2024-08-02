package LinkedListClass;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(10);
        stack.add(23);
        stack.add(33);

        System.out.println(stack);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Pop Element: " +stack.pop());

        System.out.println("Is Empty: " + stack.isEmpty());

        System.out.println(stack.search(33));
    }
}
