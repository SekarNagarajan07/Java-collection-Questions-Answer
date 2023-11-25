//Write a Java program to compare two priority queues.

import java.util.PriorityQueue;

public class Program7 {

    public static void main(String[] args) {
        // Create the first PriorityQueue
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add("Red");
        priorityQueue1.add("Green");
        priorityQueue1.add("Blue");

        // Create the second PriorityQueue with the same elements
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.add("Red");
        priorityQueue2.add("Green");
        priorityQueue2.add("Blue");

        // Compare using equals() method
        boolean isEqualUsingEquals = priorityQueue1.equals(priorityQueue2);
        System.out.println("Are the PriorityQueues equal using equals() method? " + isEqualUsingEquals);

        // Compare by iterating through elements
        boolean isEqualByIteration = comparePriorityQueues(priorityQueue1, priorityQueue2);
        System.out.println("Are the PriorityQueues equal by iteration? " + isEqualByIteration);
    }

    // Compare PriorityQueues by iterating through elements
    private static <E> boolean comparePriorityQueues(PriorityQueue<E> queue1, PriorityQueue<E> queue2) {
        if (queue1.size() != queue2.size()) {
            return false;
        }

        // Iterate through elements and compare
        for (E element : queue1) {
            if (!queue2.contains(element)) {
                return false;
            }
        }

        return true;
    }
}
