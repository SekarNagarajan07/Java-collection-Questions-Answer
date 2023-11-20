//Write a Java program to test an array list is empty or not.
import java.util.ArrayList;
import java.util.List;

public class Program18 {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> myList = new ArrayList<>();

        // Check if the ArrayList is empty
        if (myList.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Add some elements to the ArrayList
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");

        // Check again after adding elements
        if (myList.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
