// Write a Java program to create a new tree set, add some colors (string) and print out the tree set

import java.util.TreeSet;

public class Program1 {

    public static void main(String[] args) {
        // Create a new TreeSet to store colors
        TreeSet<String> colorTreeSet = new TreeSet<>();

        // Add some colors to the TreeSet
        colorTreeSet.add("Red");
        colorTreeSet.add("Green");
        colorTreeSet.add("Blue");
        colorTreeSet.add("Yellow");
        colorTreeSet.add("Orange");

        // Print out the TreeSet
        System.out.println("TreeSet of Colors: " + colorTreeSet);
    }
}
