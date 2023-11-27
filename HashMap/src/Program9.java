//Write a Java program to create a set view of the mappings contained in a map.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program9 {

    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> myMap = new HashMap<>();

        // Add some key-value mappings to the map
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Create a set view of the mappings in the map
        Set<Map.Entry<String, Integer>> entrySet = myMap.entrySet();

        // Display the contents of the set view
        System.out.println("Set view of mappings in the map:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
