import java.util.*;

public class priority_queues
{
    
    // Priority Queue = A FIFO data structure that serves elements
    //                  with the highest priorities first
    //                  before elements with lower priority.


    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        Queue<String> letterGrades = new PriorityQueue<>();

        letterGrades.offer("B");
        letterGrades.offer("C");
        letterGrades.offer("A");
        letterGrades.offer("F");
        letterGrades.offer("D");

        while(!letterGrades.isEmpty()) {
            System.out.println(letterGrades.poll());
        }


    }
}
