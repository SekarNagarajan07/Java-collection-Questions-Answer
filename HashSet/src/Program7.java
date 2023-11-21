//Write a Java program to convert a hash set to an array.

import java.util.HashSet;

import java.util.HashSet;

public class Program7 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> myHashSet = new HashSet<>();

        // Add elements to the HashSet
        myHashSet.add("Element 1");
        myHashSet.add("Element 2");
        myHashSet.add("Element 3");

        // Convert HashSet to an array
        String[] arrayFromHashSet = convertHashSetToArray(myHashSet);

        // Display the array
        System.out.println("Array from HashSet:");
        for (String element : arrayFromHashSet) {
            System.out.println(element);
        }
    }

    private static <T> T[] convertHashSetToArray(HashSet<T> hashSet) {
        // Create an array of the correct type and size
        return hashSet.toArray((T[]) new Object[hashSet.size()]);
    }
}
