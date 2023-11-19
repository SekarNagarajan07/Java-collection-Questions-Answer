// Write a Java program to join two array lists.

import java.util.ArrayList;

public class Program15 {
    public static void main(String[] args) {
        // Create two ArrayLists to store elements
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // Add elements to the first ArrayList
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Add elements to the second ArrayList
        list2.add("Grapes");
        list2.add("Cherry");
        list2.add("Mango");

        // Display the elements in both ArrayLists
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        // Join the ArrayLists (combine list2 elements into list1)
        list1.addAll(list2);

        // Display the ArrayList after joining
        System.out.println("ArrayList after joining: " + list1);
    }
}
