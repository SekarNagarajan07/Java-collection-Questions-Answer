// Write a Java program to retrieve the first element of the priority queue.

import java.util.PriorityQueue;

public class Program8 {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");

        // Retrieve the first element
        String firstElement = retrieveFirstElement(priorityQueue);

        // Print the original PriorityQueue and the first element
        System.out.println("Original PriorityQueue: " + priorityQueue);
        if (firstElement != null) {
            System.out.println("First element of the PriorityQueue: " + firstElement);
        } else {
            System.out.println("PriorityQueue is empty. No first element.");
        }
    }

    // Retrieve the first element of a PriorityQueue
    private static <E> E retrieveFirstElement(PriorityQueue<E> queue) {
        return queue.peek();
    }
}
