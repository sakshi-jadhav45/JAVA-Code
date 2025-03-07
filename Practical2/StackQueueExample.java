import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackQueueExample {
    public static void main(String[] args) {
        // Stack Implementation (LIFO)
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Popped from stack: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Queue Implementation (FIFO)
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("\nQueue: " + queue);
        System.out.println("Polled from queue: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
