//Write a Java program to update specific array element by given element.
import java.util.Arrays;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        // Creating an array
        String[] array = {"One", "Two", "Three", "Four", "Five"};

        // Displaying the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Getting user input for the index to update
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to update an element: ");
        int index = scanner.nextInt();

        // Checking if the index is within bounds
        if (index >= 0 && index < array.length) {
            // Getting user input for the new element
            System.out.print("Enter the new element: ");
            String newElement = scanner.next();

            // Updating the element at the specified index
            array[index] = newElement;

            // Displaying the updated array
            System.out.println("Array after update: " + Arrays.toString(array));
        } else {
            System.out.println("Index is out of bounds. Please enter a valid index.");
        }

        // Closing the scanner
        scanner.close();
    }
}

