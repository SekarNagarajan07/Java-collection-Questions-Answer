//Write a Java program to count the number of key-value (size) mappings in a map.

import java.util.HashMap;
import java.util.Map;

public class Program2 {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> myHashMap = new HashMap<>();

        // Add key-value mappings to the HashMap
        myHashMap.put("one", 1);
        myHashMap.put("two", 2);
        myHashMap.put("three", 3);

        // Get the number of key-value mappings (size) in the HashMap
        int mapSize = myHashMap.size();

        // Display the size of the HashMap
        System.out.println("Size of the HashMap: " + mapSize);
    }
}
