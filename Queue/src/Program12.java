//Write a Java program to change priorityQueue to maximum priorityqueue.

import java.util.PriorityQueue;

public class Program12 {

    public static void main(String[] args) {
        // Create a PriorityQueue (default is min-heap)
        PriorityQueue<Integer> minPriorityQueue = new PriorityQueue<>();

        // Add some elements to the min-heap PriorityQueue
        minPriorityQueue.add(5);
        minPriorityQueue.add(3);
        minPriorityQueue.add(8);
        minPriorityQueue.add(2);
        minPriorityQueue.add(10);

        // Convert min-heap PriorityQueue to max-heap
        PriorityQueue<Integer> maxPriorityQueue = changeToMaxPriorityQueue(minPriorityQueue);

        // Print the original and the max-heap PriorityQueues
        System.out.println("Original Min-Heap PriorityQueue: " + minPriorityQueue);
        System.out.println("Max-Heap PriorityQueue: " + maxPriorityQueue);
    }

    // Convert min-heap PriorityQueue to max-heap
    private static <E extends Comparable<E>> PriorityQueue<E> changeToMaxPriorityQueue(PriorityQueue<E> minHeap) {
        PriorityQueue<E> maxHeap = new PriorityQueue<>(minHeap.size(), (a, b) -> b.compareTo(a));
        maxHeap.addAll(minHeap);
        return maxHeap;
    }
}
