// Write a Java program to replace the second element of a ArrayList with the specified
//element.

import java.util.ArrayList;
import java.util.List;

public class Program21 {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> myList = new ArrayList<>();

        // Add some elements to the ArrayList
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Blue");

        // Display the original list
        System.out.println("Original List: " + myList);

        // Replace the second element with a specified element
        replaceSecondElement(myList, "New Item");

        // Display the list after replacement
        System.out.println("List after replacing the second element: " + myList);
    }

    private static <T> void replaceSecondElement(List<T> list, T newElement) {
        if (list.size() >= 2) {
            // Replace the second element
            list.set(1, newElement);
        } else {
            System.out.println("List does not have enough elements to replace the second element.");
        }
    }
}
