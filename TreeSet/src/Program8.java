//Write a Java program to compare two tree sets.

import java.util.TreeSet;

public class Program8 {

    public static void main(String[] args) {
        // Create the first TreeSet
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Apple");
        treeSet1.add("Banana");
        treeSet1.add("Orange");

        // Create the second TreeSet with the same elements
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Apple");
        treeSet2.add("Banana");
        treeSet2.add("Orange");

        // Compare using equals() method
        boolean isEqualUsingEquals = treeSet1.equals(treeSet2);
        System.out.println("Are the TreeSets equal using equals() method? " + isEqualUsingEquals);

        // Compare by iterating through elements
        boolean isEqualByIteration = compareTreeSets(treeSet1, treeSet2);
        System.out.println("Are the TreeSets equal by iteration? " + isEqualByIteration);
    }

    // Compare TreeSets by iterating through elements
    private static <E> boolean compareTreeSets(TreeSet<E> set1, TreeSet<E> set2) {
        if (set1.size() != set2.size()) {
            return false;
        }

        // Iterate through elements and compare
        for (E element : set1) {
            if (!set2.contains(element)) {
                return false;
            }
        }

        return true;
    }
}
