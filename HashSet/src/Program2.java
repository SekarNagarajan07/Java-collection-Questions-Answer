//Write a Java program to iterate through all elements in a hash list.

import java.util.HashSet;
import java.util.Iterator;

public class Program2 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> myHashSet = new HashSet<>();

        // Add elements to the HashSet
        myHashSet.add("Element 1");
        myHashSet.add("Element 2");
        myHashSet.add("Element 3");

        // Display the elements using iteration
        iterateThroughHashSet(myHashSet);
    }

    private static <T> void iterateThroughHashSet(HashSet<T> hashSet) {
        System.out.println("Iterating through HashSet:");

        // Create an iterator
        Iterator<T> iterator = hashSet.iterator();

        // Iterate through the elements
        while (iterator.hasNext()) {
            T element = iterator.next();
            System.out.println(element);
        }
    }
}
