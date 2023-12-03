//Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.

import java.util.*;

public class Program11 {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");

        // Given key
        int givenKey = 3;

        // Getting the key-value mapping associated with the greatest key less than or equal to the given key
        Map.Entry<Integer, String> floorEntry = treeMap.floorEntry(givenKey);

        // Displaying the result
        if (floorEntry != null) {
            System.out.println("Key-Value Mapping associated with the greatest key less than or equal to " + givenKey + ": " + floorEntry);
        } else {
            System.out.println("No key less than or equal to " + givenKey + " found.");
        }
    }
}
