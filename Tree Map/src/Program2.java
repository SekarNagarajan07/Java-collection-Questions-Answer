//Write a Java program to copy a Tree Map content to another Tree Map.

import java.util.TreeMap;

public class Program2 {

    public static void main(String[] args) {
        // Create the source TreeMap
        TreeMap<String, Integer> sourceTreeMap = new TreeMap<>();

        // Add key-value mappings to the source TreeMap
        sourceTreeMap.put("one", 1);
        sourceTreeMap.put("two", 2);
        sourceTreeMap.put("three", 3);

        // Copy the contents to another TreeMap
        TreeMap<String, Integer> destinationTreeMap = new TreeMap<>(sourceTreeMap);

        // Display the contents of both TreeMaps
        System.out.println("Source TreeMap contents: " + sourceTreeMap);
        System.out.println("Destination TreeMap contents: " + destinationTreeMap);

        // Modify the source TreeMap to demonstrate that the destination is a copy
        sourceTreeMap.put("four", 4);

        // Display the contents of both TreeMaps again
        System.out.println("\nSource TreeMap after modification: " + sourceTreeMap);
        System.out.println("Destination TreeMap after modification of source: " + destinationTreeMap);
    }
}
