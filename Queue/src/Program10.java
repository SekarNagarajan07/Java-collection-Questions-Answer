//Write a Java program to convert a priority queue to an array containing all of the elements of the queue.

import java.util.PriorityQueue;

public class Program10 {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(2);
        priorityQueue.add(10);

        // Convert the PriorityQueue to an array
        Integer[] array = convertToArrray(priorityQueue);

        // Print the original PriorityQueue and the array
        System.out.println("Original PriorityQueue: " + priorityQueue);
        System.out.println("Array representation of the PriorityQueue: " + java.util.Arrays.toString(array));
    }

    // Convert a PriorityQueue to an array
    private static <E> E[] convertToArrray(PriorityQueue<E> queue) {
        return queue.toArray((E[]) new Object[queue.size()]);
    }
}
