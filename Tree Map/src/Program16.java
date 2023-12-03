//Write a Java program to get a key-value mapping associated with the greatest key strictly
//less than the given key. Return null if there is no such key.

import java.util.*;

public class Program16 {
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

        // Getting the key-value mapping associated with the greatest key strictly less than the given key
        Map.Entry<Integer, String> greatestKeyEntry = treeMap.lowerEntry(givenKey);

        // Displaying the result
        if (greatestKeyEntry != null) {
            System.out.println("Key-Value Mapping associated with the greatest key strictly less than " + givenKey + ": " + greatestKeyEntry);
        } else {
            System.out.println("No key strictly less than " + givenKey + " found.");
        }
    }
}
