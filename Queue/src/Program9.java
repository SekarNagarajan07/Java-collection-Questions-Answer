//Write a Java program to retrieve and remove the first element.

import java.util.PriorityQueue;

public class Program9 {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(2);
        priorityQueue.add(10);

        // Retrieve and remove the first element
        Integer removedElement = retrieveAndRemoveFirstElement(priorityQueue);

        // Print the original PriorityQueue and the removed element
        System.out.println("Original PriorityQueue: " + priorityQueue);
        if (removedElement != null) {
            System.out.println("Removed element from the PriorityQueue: " + removedElement);
        } else {
            System.out.println("PriorityQueue is empty. No element removed.");
        }
    }

    // Retrieve and remove the first element of a PriorityQueue
    private static <E> E retrieveAndRemoveFirstElement(PriorityQueue<E> queue) {
        return queue.poll();
    }
}
