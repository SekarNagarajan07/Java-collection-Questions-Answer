//Write a Java program to add all the elements of a priority queue to another priority queue.

import java.util.PriorityQueue;
public class Program3 {
    public static void main(String[] args) {
        // Create the first PriorityQueue
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add("Red");
        priorityQueue1.add("Green");
        priorityQueue1.add("Blue");

        // Create the second PriorityQueue
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.add("Yellow");
        priorityQueue2.add("Orange");

        // Print the original PriorityQueues
        System.out.println("Original PriorityQueue 1: " + priorityQueue1);
        System.out.println("Original PriorityQueue 2: " + priorityQueue2);

        // Add all elements of priorityQueue1 to priorityQueue2
        priorityQueue2.addAll(priorityQueue1);

        // Print the updated PriorityQueue
        System.out.println("After adding all elements from PriorityQueue 1 to PriorityQueue 2: " + priorityQueue2);
    }
}
