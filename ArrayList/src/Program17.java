//Write a Java program to empty an array list.

import java.util.ArrayList;
import java.util.List;

public class Program17 {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> myList = new ArrayList<>();
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");

        // Display the original list
        System.out.println("Original List: " + myList);

        // Empty the ArrayList
        myList.clear();

        // Display the list after clearing
        System.out.println("List after clearing: " + myList);
    }
}
