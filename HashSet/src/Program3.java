//Write a Java program to get the number of elements in a hash set.

import java.util.HashSet;

public class Program3 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> myHashSet = new HashSet<>();

        // Add elements to the HashSet
        myHashSet.add("Element 1");
        myHashSet.add("Element 2");
        myHashSet.add("Element 3");

        // Get the number of elements in the HashSet
        int size = getHashSetSize(myHashSet);

        // Display the result
        System.out.println("Number of elements in the HashSet: " + size);
    }

    private static <T> int getHashSetSize(HashSet<T> hashSet) {
        return hashSet.size();
    }
}
