///Write a Java program to iterate through all elements in priority queue.

import java.util.PriorityQueue;
import java.util.Iterator;

public class Program2 {

    public static void main(String[] args) {
        // Create a new PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Add some colors to the PriorityQueue
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");
        priorityQueue.add("Yellow");
        priorityQueue.add("Orange");

        // Iterate through the elements using an iterator
        System.out.println("Iterating through PriorityQueue elements:");
        Iterator<String> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }
    }
}
