//Write a Java program to remove and get a key-value mapping associated with the least key in a map.

import java.util.*;

public class Program19 {
    public static void main(String[] args) {
        // Create a TreeMap (a NavigableMap implementation)
        NavigableMap<Integer, String> map = new TreeMap<>();

        // Add some key-value pairs to the map
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");
        map.put(5, "Five");
        map.put(3, "Three");

        System.out.println("Original Map: " + map);

        // Remove and get the least key-value mapping
        Map.Entry<Integer, String> leastEntry = map.pollFirstEntry();

        if (leastEntry != null) {
            int leastKey = leastEntry.getKey();
            String leastValue = leastEntry.getValue();

            System.out.println("Removed Mapping: Key=" + leastKey + ", Value=" + leastValue);
            System.out.println("Map after removal: " + map);
        } else {
            System.out.println("Map is empty.");
        }
    }
}
