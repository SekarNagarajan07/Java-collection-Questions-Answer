// Write a Java program to get the portion of a map whose keys range from a given key to
//another key.

import java.util.*;

public class Program22 {
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

        // Get a portion of the map based on key range [2, 4]
        NavigableMap<Integer, String> subMap = map.subMap(2, true, 4, true);

        System.out.println("SubMap (keys from 2 inclusive to 4 inclusive): " + subMap);
    }
}
