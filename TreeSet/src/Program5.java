//Write a Java program to get the first and last elements in a tree set.

import java.util.TreeSet;

public class Program5 {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Mango");

        // Print the original set
        System.out.println("Original TreeSet: " + treeSet);

        // Get the first element
        String firstElement = treeSet.first();
        System.out.println("First Element: " + firstElement);

        // Get the last element
        String lastElement = treeSet.last();
        System.out.println("Last Element: " + lastElement);
    }
}
