//Write a Java program to get the value of a specified key in a map.

import java.util.HashMap;
import java.util.Map;

public class Program10 {

    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> myMap = new HashMap<>();

        // Add some key-value mappings to the map
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Specify the key for which you want to get the value
        String keyToGet = "two";

        // Get the value associated with the specified key
        Integer retrievedValue = myMap.get(keyToGet);

        // Display the result
        if (retrievedValue != null) {
            System.out.println("The value associated with the key '" + keyToGet + "' is: " + retrievedValue);
        } else {
            System.out.println("No value found for the key '" + keyToGet + "'.");
        }
    }
}
