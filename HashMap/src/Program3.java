//Write a Java program to copy all of the mappings from the specified map to another map.

import java.util.HashMap;
import java.util.Map;

public class Program3 {

    public static void main(String[] args) {
        // Create the source map
        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("one", 1);
        sourceMap.put("two", 2);
        sourceMap.put("three", 3);

        // Create an empty destination map
        Map<String, Integer> destinationMap = new HashMap<>();

        // Copy all mappings from the source map to the destination map
        destinationMap.putAll(sourceMap);

        // Display the contents of the destination map
        System.out.println("Destination Map after copying:");
        for (Map.Entry<String, Integer> entry : destinationMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
