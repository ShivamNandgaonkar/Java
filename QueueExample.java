package Lab;
/*
Write a Java program that demonstrates the usage of a Queue (LinkedList):
1. Enqueue a series of elements.
2. Dequeue elements from the Queue.
3. Print the elements after each dequeue operation.
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample 
{
    public static void main(String[] args) 
    {
    	Queue<Integer> q = new LinkedList<>();

        // Enqueue a series of elements
        for (int i = 1; i <= 5; i++) {
            q.add(i);
            System.out.println("Enqueued: " + i);
        }

        // Dequeue elements from the Queue and print after each dequeue operation
        while (!q.isEmpty()) 
        {
            int r = q.poll();
            System.out.println("Dequeued elements: " + r);
            System.out.print("Current Queue: ");
            for (Integer element : q) 
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
