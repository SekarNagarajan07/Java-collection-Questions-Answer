//Write a Java program to clone a hash set to another hash set.

import java.util.HashSet;

public class Program6 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> originalHashSet = new HashSet<>();
        originalHashSet.add("Element 1");
        originalHashSet.add("Element 2");
        originalHashSet.add("Element 3");

        // Clone the HashSet using clone() method
        HashSet<String> clonedHashSet1 = cloneHashSetUsingClone(originalHashSet);

        // Clone the HashSet using constructor
        HashSet<String> clonedHashSet2 = cloneHashSetUsingConstructor(originalHashSet);

        // Display the original and cloned HashSets
        System.out.println("Original HashSet: " + originalHashSet);
        System.out.println("Cloned HashSet (using clone()): " + clonedHashSet1);
        System.out.println("Cloned HashSet (using constructor): " + clonedHashSet2);
    }

    private static <T> HashSet<T> cloneHashSetUsingClone(HashSet<T> original) {
        return (HashSet<T>) original.clone();
    }

    private static <T> HashSet<T> cloneHashSetUsingConstructor(HashSet<T> original) {
        return new HashSet<>(original);
    }
}
