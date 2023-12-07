//Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.

import java.util.*;

public class Program20 {
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

        // Remove and get the greatest key-value mapping
        Map.Entry<Integer, String> greatestEntry = map.pollLastEntry();

        if (greatestEntry != null) {
            int greatestKey = greatestEntry.getKey();
            String greatestValue = greatestEntry.getValue();

            System.out.println("Removed Mapping: Key=" + greatestKey + ", Value=" + greatestValue);
            System.out.println("Map after removal: " + map);
        } else {
            System.out.println("Map is empty.");
        }
    }
}
