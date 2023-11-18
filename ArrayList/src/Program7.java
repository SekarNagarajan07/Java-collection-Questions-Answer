//Write a Java program to search an element in an array list.
import java.util.ArrayList;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        // Create an ArrayList to store elements
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // Display the elements in the ArrayList
        System.out.println("ArrayList elements: " + arrayList);

        // Get the element to search from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        // Perform the search
        boolean found = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == searchElement) {
                found = true;
                System.out.println("Element " + searchElement + " found at index " + i);
                break; // exit the loop once the element is found
            }
        }

        // Display a message if the element is not found
        if (!found) {
            System.out.println("Element " + searchElement + " not found in the ArrayList.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

