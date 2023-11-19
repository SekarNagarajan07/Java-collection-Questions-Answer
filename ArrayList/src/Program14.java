// Write a Java program of swap two elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Program14 {
    public static void main(String[] args) {
        // Create an ArrayList to store elements
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Cherry");

        // Display the original elements in the ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Specify the positions to swap (0-based index)
        int position1 = 1;
        int position2 = 3;

        // Swap elements at the specified positions
        Collections.swap(arrayList, position1, position2);

        // Display the ArrayList after swapping
        System.out.println("ArrayList after swapping elements at positions " + position1 + " and " + position2 + ": " + arrayList);
    }
}
