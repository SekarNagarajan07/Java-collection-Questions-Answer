//Write a Java program to check whether a map contains key-value mappings (empty) or not.

import java.util.HashMap;
import java.util.Map;

public class Program5 {

    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> myMap = new HashMap<>();

        // Check if the map is empty
        boolean isEmptyBeforeAdding = myMap.isEmpty();
        System.out.println("Is the map empty before adding any mappings? " + isEmptyBeforeAdding);

        // Add some key-value mappings to the map
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Check if the map is empty after adding mappings
        boolean isEmptyAfterAdding = myMap.isEmpty();
        System.out.println("Is the map empty after adding mappings? " + isEmptyAfterAdding);

        // Remove all mappings from the map
        myMap.clear();

        // Check if the map is empty after removal
        boolean isEmptyAfterRemoval = myMap.isEmpty();
        System.out.println("Is the map empty after removal? " + isEmptyAfterRemoval);
    }
}
