//Write a Java program to append the specified element to the end of a hash set.

import java.util.HashSet;

public class Program1 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> myHashSet = new HashSet<>();

        // Add elements to the HashSet
        myHashSet.add("Element 1");
        myHashSet.add("Element 2");
        myHashSet.add("Element 3");

        // Display the original HashSet
        System.out.println("Original HashSet: " + myHashSet);

        // Append a specified element to the end
        String elementToAppend = "New Element";
        appendElementToHashSet(myHashSet, elementToAppend);

        // Display the HashSet after appending
        System.out.println("HashSet after appending: " + myHashSet);
    }

    private static <T> void appendElementToHashSet(HashSet<T> hashSet, T element) {
        hashSet.add(element);
    }
}
