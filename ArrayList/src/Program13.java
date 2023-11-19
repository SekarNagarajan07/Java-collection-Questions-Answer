//Write a Java program to compare two array lists.

import java.util.ArrayList;

public class Program13 {
    public static void main(String[] args) {
        // Create two ArrayLists to store elements
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // Add elements to the first ArrayList
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Add elements to the second ArrayList
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Orange");

        // Display the elements in both ArrayLists
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        // Compare the ArrayLists
        if (list1.equals(list2)) {
            System.out.println("The ArrayLists are equal.");
        } else {
            System.out.println("The ArrayLists are not equal.");
        }
    }
}
