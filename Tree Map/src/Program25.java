//Write a Java program to get a key-value mapping associated with the least key greater than
//or equal to the given key. Return null if there is no such key.

import java.util.*;

public class Program25 {
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

        // Get the key-value mapping associated with the least key greater than or equal to a given key (e.g., key=2)
        Map.Entry<Integer, String> ceilingEntry = map.ceilingEntry(2);

        if (ceilingEntry != null) {
            int leastGreaterOrEqualKey = ceilingEntry.getKey();
            String value = ceilingEntry.getValue();

            System.out.println("Ceiling Entry: Key=" + leastGreaterOrEqualKey + ", Value=" + value);
        } else {
            System.out.println("No key greater than or equal to the given key.");
        }
    }
}
