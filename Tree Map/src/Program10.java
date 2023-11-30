//Write a Java program to get a reverse order view of the keys contained in a given map.

import java.util.*;

public class Program10 {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");

        // Getting a reverse order view of the keys
        NavigableSet<Integer> reverseKeySet = treeMap.descendingKeySet();

        // Displaying the reverse order view of the keys
        System.out.println("Reverse Order View of Keys: " + reverseKeySet);
    }
}
