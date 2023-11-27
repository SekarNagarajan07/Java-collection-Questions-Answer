//Write a Java program to get a set view of the keys contained in this map.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program11 {

    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> myMap = new HashMap<>();

        // Add some key-value mappings to the map
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Create a set view of the keys in the map
        Set<String> keySet = myMap.keySet();

        // Display the contents of the set view
        System.out.println("Set view of keys in the map:");
        for (String key : keySet) {
            System.out.println("Key: " + key);
        }
    }
}
