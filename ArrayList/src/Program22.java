//Write a Java program to print all the elements of a ArrayList using the position of the
//elements.

import java.util.ArrayList;
import java.util.List;

public class Program22 {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> myList = new ArrayList<>();

        // Add some elements to the ArrayList
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        myList.add("Four");

        // Print all elements with their positions
        printElementsWithPosition(myList);
    }

    private static <T> void printElementsWithPosition(List<T> list) {
        System.out.println("Printing elements with their positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + (i + 1) + ": " + list.get(i));
        }
    }
}
