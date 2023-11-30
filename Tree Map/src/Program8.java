//Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.

import java.util.*;

public class Program8 {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");

        // Getting the key-value mapping associated with the least key
        Map.Entry<Integer, String> leastEntry = treeMap.firstEntry();

        // Getting the key-value mapping associated with the greatest key
        Map.Entry<Integer, String> greatestEntry = treeMap.lastEntry();

        // Displaying the key-value mappings
        System.out.println("Key-Value Mapping associated with the least key: " + leastEntry);
        System.out.println("Key-Value Mapping associated with the greatest key: " + greatestEntry);
    }
}
