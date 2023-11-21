//Write a Java program to convert a hash set to a List/Array List.

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Program9 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> myHashSet = new HashSet<>();

        // Add elements to the HashSet
        myHashSet.add("Element 3");
        myHashSet.add("Element 1");
        myHashSet.add("Element 2");

        // Convert HashSet to ArrayList
        ArrayList<String> myArrayList = convertHashSetToArrayList(myHashSet);

        // Display the ArrayList
        System.out.println("ArrayList from HashSet:");
        for (String element : myArrayList) {
            System.out.println(element);
        }

        // Convert HashSet to List (general interface)
        List<String> myList = convertHashSetToList(myHashSet);

        // Display the List
        System.out.println("List from HashSet:");
        for (String element : myList) {
            System.out.println(element);
        }
    }

    private static <T> ArrayList<T> convertHashSetToArrayList(HashSet<T> hashSet) {
        // Create a new ArrayList and add all elements from the HashSet
        return new ArrayList<>(hashSet);
    }

    private static <T> List<T> convertHashSetToList(HashSet<T> hashSet) {
        // Create a new List and add all elements from the HashSet
        return new ArrayList<>(hashSet);
    }
}
