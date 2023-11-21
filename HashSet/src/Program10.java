// Write a Java program to compare two hash set.

import java.util.HashSet;

public class Program10 {
    public static void main(String[] args) {
        // Create the first HashSet
        HashSet<String> set1 = new HashSet<>();
        set1.add("Element 1");
        set1.add("Element 2");
        set1.add("Element 3");

        // Create the second HashSet
        HashSet<String> set2 = new HashSet<>();
        set2.add("Element 3");
        set2.add("Element 1");
        set2.add("Element 2");

        // Compare the two HashSets
        boolean areEqual = compareHashSets(set1, set2);

        // Display the result
        if (areEqual) {
            System.out.println("The two HashSets are equal.");
        } else {
            System.out.println("The two HashSets are not equal.");
        }
    }

    private static <T> boolean compareHashSets(HashSet<T> set1, HashSet<T> set2) {
        // Check if the two HashSets have the same elements
        return set1.equals(set2);
    }
}
