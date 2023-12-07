//Write a Java program to get the least key greater than or equal to the given key. Returns
//null if there is no such keys

import java.util.*;

public class Program26 {
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

        // Get the least key greater than or equal to a given key (e.g., key=2)
        Map.Entry<Integer, String> entry = map.ceilingEntry(2);

        if (entry != null) {
            int leastGreaterOrEqualKey = entry.getKey();
            String value = entry.getValue();

            System.out.println("Least Key Greater Than or Equal To Given Key: Key=" + leastGreaterOrEqualKey + ", Value=" + value);
        } else {
            System.out.println("No key greater than or equal to the given key.");
        }
    }
}
