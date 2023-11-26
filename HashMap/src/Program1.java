//Write a Java program to associate the specified value with the specified key in a HashMap.

import java.util.HashMap;
import java.util.Map;

public class Program1 {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> myHashMap = new HashMap<>();

        // Associate a value with a key
        String key = "exampleKey";
        int value = 42;
        myHashMap.put(key, value);

        // Display the contents of the HashMap
        System.out.println("HashMap contents: " + myHashMap);

        // Retrieve the value associated with the key
        int retrievedValue = myHashMap.get(key);
        System.out.println("Value associated with key '" + key + "': " + retrievedValue);
    }
}
