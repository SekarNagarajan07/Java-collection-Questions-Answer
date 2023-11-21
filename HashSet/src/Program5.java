// Write a Java program to test a hash set is empty or not.

import java.util.HashSet;

public class Program5 {
    public static void main(String[] args) {
        // Create an empty HashSet
        HashSet<String> emptyHashSet = new HashSet<>();

        // Create a non-empty HashSet
        HashSet<String> nonEmptyHashSet = new HashSet<>();
        nonEmptyHashSet.add("Element 1");

        // Test if the hash sets are empty
        testIfEmpty(emptyHashSet);
        testIfEmpty(nonEmptyHashSet);
    }

    private static <T> void testIfEmpty(HashSet<T> hashSet) {
        if (hashSet.isEmpty()) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }
    }
}
