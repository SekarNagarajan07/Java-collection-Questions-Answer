//Write a Java program to convert a hash set to a tree set.

import java.util.HashSet;
import java.util.TreeSet;

public class Program8 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> myHashSet = new HashSet<>();

        // Add elements to the HashSet
        myHashSet.add("Element 3");
        myHashSet.add("Element 1");
        myHashSet.add("Element 2");

        // Convert HashSet to TreeSet
        TreeSet<String> myTreeSet = convertHashSetToTreeSet(myHashSet);

        // Display the TreeSet
        System.out.println("TreeSet from HashSet:");
        for (String element : myTreeSet) {
            System.out.println(element);
        }
    }

    private static <T> TreeSet<T> convertHashSetToTreeSet(HashSet<T> hashSet) {
        // Create a new TreeSet and add all elements from the HashSet
        return new TreeSet<>(hashSet);
    }
}
