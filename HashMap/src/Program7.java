//Write a Java program to test if a map contains a mapping for the specified key.

import java.util.HashMap;
import java.util.Map;

public class Program7 {

    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> myMap = new HashMap<>();

        // Add some key-value mappings to the map
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Test if the map contains a mapping for a specified key
        String keyToCheck = "two";
        if (myMap.containsKey(keyToCheck)) {
            System.out.println("The map contains a mapping for the key '" + keyToCheck + "'.");
        } else {
            System.out.println("The map does not contain a mapping for the key '" + keyToCheck + "'.");
        }

        // Test with a key that is not in the map
        String nonExistentKey = "four";
        if (myMap.containsKey(nonExistentKey)) {
            System.out.println("The map contains a mapping for the key '" + nonExistentKey + "'.");
        } else {
            System.out.println("The map does not contain a mapping for the key '" + nonExistentKey + "'.");
        }
    }
}
