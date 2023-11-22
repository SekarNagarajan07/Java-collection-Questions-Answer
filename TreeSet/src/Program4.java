// Write a Java program to create a reverse order view of the elements contained in a given tree set.

import java.util.TreeSet;
import java.util.Iterator;

public class Program4 {

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

        // Create a reverse order view using descendingSet()
        TreeSet<String> reverseOrderView = new TreeSet<>(treeSet.descendingSet());

        // Print the reverse order view
        System.out.println("Reverse Order View: " + reverseOrderView);

        // Alternatively, you can iterate through the reverse order view
        System.out.println("Iterating through Reverse Order View:");
        Iterator<String> iterator = reverseOrderView.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
