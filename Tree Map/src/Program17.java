//Write a Java program to get the greatest key strictly less than the given key. Return null if
//there is no such key.

import java.util.*;

public class Program17 {
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

        // Getting the greatest key strictly less than the given key
        Integer greatestKey = treeMap.lowerKey(givenKey);

        // Displaying the result
        if (greatestKey != null) {
            System.out.println("Greatest Key strictly less than " + givenKey + ": " + greatestKey);
        } else {
            System.out.println("No key strictly less than " + givenKey + " found.");
        }
    }
}
