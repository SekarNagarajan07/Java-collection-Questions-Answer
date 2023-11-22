//Write a Java program to find the numbers less than 7 in a tree set.

import java.util.TreeSet;

public class Program9 {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(10);

        // Find numbers less than 7
        TreeSet<Integer> numbersLessThan7 = findNumbersLessThan(treeSet, 7);

        // Print the original set
        System.out.println("Original TreeSet: " + treeSet);

        // Print the numbers less than 7
        System.out.println("Numbers less than 7: " + numbersLessThan7);
    }

    // Find numbers less than a given value in a TreeSet
    private static TreeSet<Integer> findNumbersLessThan(TreeSet<Integer> set, int value) {
        TreeSet<Integer> result = new TreeSet<>();

        for (Integer element : set) {
            if (element < value) {
                result.add(element);
            }
        }

        return result;
    }
}
