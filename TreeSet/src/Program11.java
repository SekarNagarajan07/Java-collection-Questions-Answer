// Write a Java program to get the element in a tree set which is less than or equal to the given element.
import java.util.TreeSet;
public class Program11 {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(10);

        // Find the element less than or equal to a given element
        int givenElement = 6;
        Integer result = findLessThanOrEqualTo(treeSet, givenElement);

        // Print the original set
        System.out.println("Original TreeSet: " + treeSet);

        // Print the result
        if (result != null) {
            System.out.println("Element less than or equal to " + givenElement + ": " + result);
        } else {
            System.out.println("No element less than or equal to " + givenElement + " found.");
        }
    }

    // Find the element less than or equal to a given value in a TreeSet
    private static Integer findLessThanOrEqualTo(TreeSet<Integer> set, int value) {
        return set.floor(value);
    }
}
