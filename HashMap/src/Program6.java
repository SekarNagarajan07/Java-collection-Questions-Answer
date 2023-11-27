//Write a Java program to get a shallow copy of a HashMap instance.

import java.util.HashMap;
import java.util.Map;

public class Program6 {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("one", 1);
        originalMap.put("two", 2);
        originalMap.put("three", 3);

        // Shallow copy using clone
        Map<String, Integer> shallowCopyMap = new HashMap<>(originalMap);
        // Alternatively: Map<String, Integer> shallowCopyMap = (Map<String, Integer>) originalMap.clone();

        // Display the contents of the original and copied maps
        System.out.println("Original Map: " + originalMap);
        System.out.println("Shallow Copy Map: " + shallowCopyMap);

        // Modify the original map to demonstrate the shallow copy
        originalMap.put("four", 4);

        // Display the contents again to show that the shallow copy is not affected
        System.out.println("\nOriginal Map after modification: " + originalMap);
        System.out.println("Shallow Copy Map after modification: " + shallowCopyMap);
    }
}
