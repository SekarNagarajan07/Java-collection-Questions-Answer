//Write a Java program to add all the elements of a specified tree set to another tree set

import java.util.TreeSet;

public class Program3 {

    public static void main(String[] args) {
        // Create the first TreeSet
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Apple");
        treeSet1.add("Banana");
        treeSet1.add("Orange");

        // Create the second TreeSet
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Grapes");
        treeSet2.add("Mango");

        // Print the original sets
        System.out.println("Original TreeSet 1: " + treeSet1);
        System.out.println("Original TreeSet 2: " + treeSet2);

        // Add all elements of treeSet1 to treeSet2
        treeSet2.addAll(treeSet1);

        // Print the updated set
        System.out.println("After adding all elements from TreeSet 1 to TreeSet 2: " + treeSet2);
    }
}
