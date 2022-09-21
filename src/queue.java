import java.util.Queue;
import java.util.LinkedList;



public class queue {
    public static void main(String[] args) {
        /* Queue = FIFO data structure. First-In First-Out
         *         a collection designed for holding elements prior to processing
         *         linear data structure.
         * 
         *         enqueue = offer()
         *         dequeue = poll()
         * 
         */

         Queue<String> queue = new LinkedList<String>();
        System.out.println(queue.isEmpty());
         queue.offer("Karen");
         queue.offer("Chad");
         queue.offer("Steve");
         queue.offer("Harold");
        
         System.out.println(queue.size());
         System.out.println(queue.contains("Harold"));
         queue.poll();

         System.out.println(queue);
        
         // Where are queues useful?
         // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
         // 2. Printer Queue (Print jobs should be completed in order)
         // 3. Used in LinekdLists, PriorityQueues, Breadth-first search.

    }
}
