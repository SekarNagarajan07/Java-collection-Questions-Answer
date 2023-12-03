//Write a Java program to associate the specified value with the specified key in a Tree Map.

import java.util.TreeMap;

public class Program1 {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Associate a value with a key
        String key = "exampleKey";
        int value = 42;
        treeMap.put(key, value);

        // Display the contents of the TreeMap
        System.out.println("TreeMap contents: " + treeMap);

        // Retrieve the value associated with the key
        int retrievedValue = treeMap.get(key);
        System.out.println("Value associated with key '" + key + "': " + retrievedValue);
    }
}
