//Write a Java program to copy one array list into another.

import java.util.ArrayList;

public class Program9 {
    public static void main(String[] args) {
        // Create the source ArrayList
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Orange");
        sourceList.add("Grapes");

        // Create a new ArrayList as a copy of the sourceList
        ArrayList<String> destinationList = new ArrayList<>(sourceList);

        // Print the original and copied ArrayLists
        System.out.println("Source ArrayList: " + sourceList);
        System.out.println("Copied ArrayList: " + destinationList);
    }
}

