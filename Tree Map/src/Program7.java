//Write a Java program to sort keys in Tree Map by using comparator.

import java.util.*;

public class Program7 {
    public static void main(String[] args) {
        // Creating a TreeMap with a custom comparator to sort keys
        TreeMap<Integer, String> treeMap = new TreeMap<>(new CustomComparator());

        // Adding elements to the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");

        // Displaying the TreeMap before sorting
        System.out.println("TreeMap before sorting by key: " + treeMap);

        // TreeMap automatically uses the custom comparator for sorting keys

        // Displaying the TreeMap after sorting by key
        System.out.println("TreeMap after sorting by key: " + treeMap);
    }
}

// Custom comparator to sort keys in ascending order
class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer key1, Integer key2) {
        return key1.compareTo(key2);
    }
}
