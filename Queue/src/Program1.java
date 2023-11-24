//Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.

import java.util.PriorityQueue;

public class Program1 {

    public static void main(String[] args) {
        // Create a new PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Add some colors to the PriorityQueue
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");
        priorityQueue.add("Yellow");
        priorityQueue.add("Orange");

        // Print out the elements of the PriorityQueue
        System.out.println("Elements of the PriorityQueue:");
        while (!priorityQueue.isEmpty()) {
            String color = priorityQueue.poll();
            System.out.println(color);
        }
    }
}
