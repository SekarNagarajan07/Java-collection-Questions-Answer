//Write a Java program to iterate through all elements in a tree set.

import java.util.TreeSet;
import java.util.Iterator;

public class Program2 {

    public static void main(String[] args) {
        // Create a new TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Mango");

        // Iterate through the elements using an iterator
        System.out.println("Iterating through TreeSet elements:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
