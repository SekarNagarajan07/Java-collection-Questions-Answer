//Write a Java program to delete all elements from a given Tree Map.

import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        // Displaying the TreeMap before clearing
        System.out.println("TreeMap before clearing: " + treeMap);

        // Clearing all elements from the TreeMap
        treeMap.clear();

        // Displaying the TreeMap after clearing
        System.out.println("TreeMap after clearing: " + treeMap);
    }
}
