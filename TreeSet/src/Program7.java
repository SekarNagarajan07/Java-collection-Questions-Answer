//Write a Java program to get the number of elements in a tree set.

import java.util.TreeSet;

public class Program7 {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Mango");

        // Get the number of elements in the TreeSet
        int size = treeSet.size();

        // Print the number of elements
        System.out.println("Number of elements in the TreeSet: " + size);
    }
}
