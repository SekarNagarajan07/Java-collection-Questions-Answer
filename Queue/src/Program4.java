//Write a Java program to insert a given element into a priority queue.

import java.util.PriorityQueue;

public class Program4 {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(2);
        priorityQueue.add(10);

        // Print the original PriorityQueue
        System.out.println("Original PriorityQueue: " + priorityQueue);

        // Insert a given element
        int elementToInsert = 7;
        insertElement(priorityQueue, elementToInsert);

        // Print the updated PriorityQueue
        System.out.println("PriorityQueue after inserting " + elementToInsert + ": " + priorityQueue);
    }

    // Insert a given element into a PriorityQueue
    private static void insertElement(PriorityQueue<Integer> queue, int element) {
        queue.add(element);
    }
}
