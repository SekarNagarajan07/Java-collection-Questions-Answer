//Write a Java program to compare two sets and retain elements which are same on both sets.

import java.util.HashSet;
import java.util.Set;

public class Program11 {
    public static void main(String[] args) {
        // Create the first set
        Set<String> set1 = new HashSet<>();
        set1.add("Element 1");
        set1.add("Element 2");
        set1.add("Element 3");

        // Create the second set
        Set<String> set2 = new HashSet<>();
        set2.add("Element 3");
        set2.add("Element 4");
        set2.add("Element 5");

        // Retain elements that are common to both sets
        retainCommonElements(set1, set2);

        // Display the modified sets
        System.out.println("Set 1 after retaining common elements: " + set1);
        System.out.println("Set 2 after retaining common elements: " + set2);
    }

    private static <T> void retainCommonElements(Set<T> set1, Set<T> set2) {
        // Retain elements that are common to both sets
        set1.retainAll(set2);
    }
}
