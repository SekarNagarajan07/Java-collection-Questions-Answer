//Write a Java program to retrieve an element (at a specified index) from a given array list.{
import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");

        // Displaying the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Getting user input for the index to retrieve
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to retrieve an element: ");
        int index = scanner.nextInt();

        // Checking if the index is within bounds
        if (index >= 0 && index < arrayList.size()) {
            // Retrieving the element at the specified index
            String retrievedElement = arrayList.get(index);
            System.out.println("Element at index " + index + ": " + retrievedElement);
        } else {
            System.out.println("Index is out of bounds. Please enter a valid index.");
        }

        // Closing the scanner
        scanner.close();
    }
}
