// Write a Java program to shuffle elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Program10 {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grapes");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + myList);

        // Shuffle the elements in the ArrayList
        Collections.shuffle(myList);

        // Print the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + myList);
    }
}
