//Write a Java program to search a key in a Tree Map.

import java.util.TreeMap;

public class Program3 {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value mappings to the TreeMap
        treeMap.put("one", 1);
        treeMap.put("two", 2);
        treeMap.put("three", 3);

        // Search for a key
        String keyToSearch = "two";
        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key '" + keyToSearch + "' found with value: " + treeMap.get(keyToSearch));
        } else {
            System.out.println("Key '" + keyToSearch + "' not found.");
        }
    }
}
