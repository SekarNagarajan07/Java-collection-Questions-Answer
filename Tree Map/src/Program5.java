//Write a Java program to get all keys from the given a Tree Map.

import java.util.Set;
import java.util.TreeMap;

public class Program5 {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value mappings to the TreeMap
        treeMap.put("one", 1);
        treeMap.put("two", 2);
        treeMap.put("three", 3);

        // Get all keys
        Set<String> keys = treeMap.keySet();

        // Display all keys
        System.out.println("All keys in the TreeMap: " + keys);
    }
}
