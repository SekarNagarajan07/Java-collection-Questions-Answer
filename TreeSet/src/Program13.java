//Write a Java program to get an element in a tree set which is strictly less than the given element.

import java.util.TreeSet;

public class Program13 {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(10);

        // Find the element strictly less than a given element
        int givenElement = 6;
        Integer result = findStrictlyLessThan(treeSet, givenElement);

        // Print the original set
        System.out.println("Original TreeSet: " + treeSet);

        // Print the result
        if (result != null) {
            System.out.println("Element strictly less than " + givenElement + ": " + result);
        } else {
            System.out.println("No element strictly less than " + givenElement + " found.");
        }
    }

    // Find the element strictly less than a given value in a TreeSet
    private static Integer findStrictlyLessThan(TreeSet<Integer> set, int value) {
        return set.lower(value);
    }
}
