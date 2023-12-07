//Write a Java program to get NavigableSet view of the keys contained in a map.

import java.util.*;

public class Program18 {
    public static void main(String[] args) {
        // Create a TreeMap (a NavigableMap implementation)
        NavigableMap<Integer, String> map = new TreeMap<>();

        // Add some key-value pairs to the map
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");
        map.put(5, "Five");
        map.put(3, "Three");

        // Get a NavigableSet view of the keys
        NavigableSet<Integer> navigableSet = map.navigableKeySet();

        // Display the keys using the NavigableSet
        System.out.println("NavigableSet of Keys: " + navigableSet);

        // You can now use the NavigableSet methods on the keys
        // For example, getting the first and last keys
        System.out.println("First Key: " + navigableSet.first());
        System.out.println("Last Key: " + navigableSet.last());
    }
}
