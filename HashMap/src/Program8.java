//Write a Java program to test if a map contains a mapping for the specified value.
import java.util.HashMap;
import java.util.Map;

public class Program8 {

    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> myMap = new HashMap<>();

        // Add some key-value mappings to the map
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Test if the map contains a mapping for a specified value
        int valueToCheck = 2;
        if (myMap.containsValue(valueToCheck)) {
            System.out.println("The map contains a mapping for the value '" + valueToCheck + "'.");
        } else {
            System.out.println("The map does not contain a mapping for the value '" + valueToCheck + "'.");
        }

        // Test with a value that is not in the map
        int nonExistentValue = 4;
        if (myMap.containsValue(nonExistentValue)) {
            System.out.println("The map contains a mapping for the value '" + nonExistentValue + "'.");
        } else {
            System.out.println("The map does not contain a mapping for the value '" + nonExistentValue + "'.");
        }
    }
}
