//Write a Java program to empty a hash set.

import java.util.HashSet;

public class Program4 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> myHashSet = new HashSet<>();

        // Add elements to the HashSet
        myHashSet.add("Element 1");
        myHashSet.add("Element 2");
        myHashSet.add("Element 3");

        // Display the original HashSet
        System.out.println("Original HashSet: " + myHashSet);

        // Empty the HashSet
        emptyHashSet(myHashSet);

        // Display the HashSet after emptying
        System.out.println("HashSet after emptying: " + myHashSet);
    }

    private static <T> void emptyHashSet(HashSet<T> hashSet) {
        hashSet.clear();
    }
}
