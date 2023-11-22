//Write a Java program to remove all of the elements from a hash set.

import java.util.HashSet;

public class Program12 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> myHashSet = new HashSet<>();

        // Add elements to the HashSet
        myHashSet.add("Element 1");
        myHashSet.add("Element 2");
        myHashSet.add("Element 3");

        // Display the original HashSet
        System.out.println("Original HashSet: " + myHashSet);

        // Remove all elements from the HashSet
        removeAllElements(myHashSet);

        // Display the HashSet after removing all elements
        System.out.println("HashSet after removing all elements: " + myHashSet);
    }

    private static <T> void removeAllElements(HashSet<T> hashSet) {
        // Use the clear() method to remove all elements
        hashSet.clear();
    }
}
