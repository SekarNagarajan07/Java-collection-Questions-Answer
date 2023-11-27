//Write a Java program to remove all of the mappings from a map.

import java.util.HashMap;
import java.util.Map;

public class Program4 {

    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> myMap = new HashMap<>();

        // Add some key-value mappings to the map
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Display the contents of the map before removal
        System.out.println("Map contents before removal:");
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Remove all mappings from the map
        myMap.clear();

        // Display the contents of the map after removal
        System.out.println("\nMap contents after removal:");
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Check if the map is now empty
        boolean isEmpty = myMap.isEmpty();
        System.out.println("\nIs the map empty? " + isEmpty);
    }
}
