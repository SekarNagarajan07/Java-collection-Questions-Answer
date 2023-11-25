//Write a Java program to convert a Priority Queue elements to a string representation.

import java.util.PriorityQueue;

public class Program11 {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");

        // Convert the PriorityQueue elements to a string representation
        String stringRepresentation = convertToString(priorityQueue);

        // Print the original PriorityQueue and the string representation
        System.out.println("Original PriorityQueue: " + priorityQueue);
        System.out.println("String representation of the PriorityQueue: " + stringRepresentation);
    }

    // Convert PriorityQueue elements to a string
    private static <E> String convertToString(PriorityQueue<E> queue) {
        // Using toString() method
        // return queue.toString();

        // Manually concatenating elements into a string
        StringBuilder result = new StringBuilder("[");
        for (E element : queue) {
            result.append(element).append(", ");
        }
        if (result.length() > 1) {
            result.setLength(result.length() - 2); // Remove the trailing ", "
        }
        result.append("]");
        return result.toString();
    }
}
