//Write a Java program to count the number of elements in a priority queue.

import java.util.PriorityQueue;

public class Program6 {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");

        // Count the number of elements in the PriorityQueue
        int count = countElements(priorityQueue);

        // Print the original PriorityQueue and the count
        System.out.println("Original PriorityQueue: " + priorityQueue);
        System.out.println("Number of elements in the PriorityQueue: " + count);
    }

    // Count the number of elements in a PriorityQueue
    private static int countElements(PriorityQueue<String> queue) {
        return queue.size();
    }
}
