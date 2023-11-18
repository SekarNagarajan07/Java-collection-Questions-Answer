//Write a Java program to sort a given array list

import java.util.ArrayList;
import java.util.Collections;

public class Program8 {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);

        // Print the original list
        System.out.println("Original ArrayList: " + numbers);

        // Sort the ArrayList in descending order
        Collections.sort(numbers, Collections.reverseOrder());

        // Print the sorted list
        System.out.println("Sorted ArrayList (Descending): " + numbers);
    }
}
