//Write a Java program to retrieve and remove the first element of a tree set.

import java.util.TreeSet;

public class Program14 {

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

        // Retrieve and remove the first element
        String removedElement = removeFirstElement(treeSet);

        // Print the updated set
        System.out.println("TreeSet after removing the first element: " + treeSet);

        // Print the removed element
        if (removedElement != null) {
            System.out.println("Removed element: " + removedElement);
        } else {
            System.out.println("TreeSet is empty. No element removed.");
        }
    }

    // Retrieve and remove the first element of a TreeSet
    private static String removeFirstElement(TreeSet<String> set) {
        return set.pollFirst();
    }
}
