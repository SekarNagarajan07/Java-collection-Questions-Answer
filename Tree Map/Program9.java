//Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.

import java.util.*;

public class Program9 {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");

        // Getting the first (lowest) key
        Integer firstKey = treeMap.firstKey();

        // Getting the last (highest) key
        Integer lastKey = treeMap.lastKey();

        // Displaying the first and last keys
        System.out.println("First (lowest) key: " + firstKey);
        System.out.println("Last (highest) key: " + lastKey);
    }
}
