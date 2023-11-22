//Write a Java program to clone a tree set list to another tree set.
import java.util.TreeSet;
public class Program6 {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> originalTreeSet = new TreeSet<>();

        // Add elements to the original TreeSet
        originalTreeSet.add("Apple");
        originalTreeSet.add("Banana");
        originalTreeSet.add("Orange");
        originalTreeSet.add("Grapes");
        originalTreeSet.add("Mango");

        // Print the original set
        System.out.println("Original TreeSet: " + originalTreeSet);

        // Clone the original TreeSet to another TreeSet
        TreeSet<String> clonedTreeSet = (TreeSet<String>) originalTreeSet.clone();

        // Print the cloned set
        System.out.println("Cloned TreeSet: " + clonedTreeSet);
    }
}
