//Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Program11 {
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

        // Reverse the elements in the ArrayList
        Collections.reverse(arrayList);

        // Display the reversed elements in the ArrayList
        System.out.println("Reversed ArrayList: " + arrayList);
    }
}
