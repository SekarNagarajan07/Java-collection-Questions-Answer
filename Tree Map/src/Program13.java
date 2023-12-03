//Write a Java program to get the portion of a map whose keys are strictly less than a given key.

import java.util.*;

public class Program13 {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");

        // Given key
        int givenKey = 3;

        // Getting the portion of the map whose keys are strictly less than the given key
        SortedMap<Integer, String> portionMap = treeMap.headMap(givenKey);

        // Displaying the result
        System.out.println("Portion of the Map whose keys are strictly less than " + givenKey + ": " + portionMap);
    }
}
