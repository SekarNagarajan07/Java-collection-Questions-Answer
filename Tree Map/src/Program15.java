//Write a Java program to get the least key strictly greater than the given key. Return null if
//there is no such key.

import java.util.*;

public class Program15 {
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

        // Getting the least key strictly greater than the given key
        Integer leastKey = treeMap.higherKey(givenKey);

        // Displaying the result
        if (leastKey != null) {
            System.out.println("Least Key strictly greater than " + givenKey + ": " + leastKey);
        } else {
            System.out.println("No key strictly greater than " + givenKey + " found.");
        }
    }
}
