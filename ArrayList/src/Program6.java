//Write a Java program to remove the third element from an array list.
import java.util.ArrayList;

public class Program6 {
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

        // Removing the third element (index 2)
        if (arrayList.size() >= 3) {
            arrayList.remove(2);
            System.out.println("ArrayList after removing the third element: " + arrayList);
        } else {
            System.out.println("ArrayList does not have a third element to remove.");
        }
    }
}
