//Write a Java program to get a portion of a map whose keys are greater than to a given key.

import java.util.*;

public class Program24 {
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

        // Get a portion of the map whose keys are greater than a given key (e.g., key=3)
        NavigableMap<Integer, String> tailMap = map.tailMap(3, false);

        System.out.println("TailMap (keys greater than 3): " + tailMap);
    }
}
