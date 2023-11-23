//Write a Java program to remove a given element from a tree set.

import java.util.TreeSet;

public class Program16 {

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

        // Remove a given element
        String elementToRemove = "Banana";
        boolean isRemoved = removeElement(treeSet, elementToRemove);

        // Print the updated set
        if (isRemoved) {
            System.out.println("TreeSet after removing '" + elementToRemove + "': " + treeSet);
        } else {
            System.out.println("'" + elementToRemove + "' not found in the TreeSet. No element removed.");
        }
    }

    // Remove a given element from a TreeSet
    private static boolean removeElement(TreeSet<String> set, String element) {
        return set.remove(element);
    }
}
