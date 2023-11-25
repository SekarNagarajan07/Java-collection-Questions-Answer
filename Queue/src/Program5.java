//Write a Java program to remove all the elements from a priority queue.

import java.util.PriorityQueue;

public class Program5 {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");

        // Print the original PriorityQueue
        System.out.println("Original PriorityQueue: " + priorityQueue);

        // Remove all elements from the PriorityQueue
        clearPriorityQueue(priorityQueue);

        // Print the PriorityQueue after removal
        System.out.println("PriorityQueue after removing all elements: " + priorityQueue);
    }

    // Remove all elements from a PriorityQueue
    private static void clearPriorityQueue(PriorityQueue<String> queue) {
        queue.clear();
    }
}
