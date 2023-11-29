//Write a Java program to search a value in a Tree Map.

import java.util.TreeMap;

public class Program4 {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value mappings to the TreeMap
        treeMap.put("one", 1);
        treeMap.put("two", 2);
        treeMap.put("three", 3);

        // Search for a value
        int valueToSearch = 2;
        if (treeMap.containsValue(valueToSearch)) {
            System.out.println("Value '" + valueToSearch + "' found in the TreeMap.");
        } else {
            System.out.println("Value '" + valueToSearch + "' not found.");
        }
    }
}
