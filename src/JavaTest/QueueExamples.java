package JavaTest;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue);

        System.out.println(queue.peek());

        queue.remove();
        System.out.println(queue);
    }
}
