// Write a Java program to get a collection view of the values contained in this map.

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Program12 {

    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> myMap = new HashMap<>();

        // Add some key-value mappings to the map
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Create a collection view of the values in the map
        Collection<Integer> values = myMap.values();

        // Display the contents of the collection view
        System.out.println("Collection view of values in the map:");
        for (Integer value : values) {
            System.out.println("Value: " + value);
        }
    }
}
