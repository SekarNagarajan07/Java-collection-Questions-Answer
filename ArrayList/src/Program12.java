//Write a Java program to extract a portion of an array list

import java.util.ArrayList;
import java.util.List;

public class Program12 {
    public static void main(String[] args) {
        // Create an ArrayList to store elements
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);

        // Display the original elements in the ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Specify the range to extract (inclusive start, exclusive end)
        int startIndex = 2;
        int endIndex = 5;

        // Extract a portion of the ArrayList using subList
        List<Integer> subList = arrayList.subList(startIndex, endIndex);

        // Display the extracted portion of the ArrayList
        System.out.println("Extracted Sublist: " + subList);
    }
}
