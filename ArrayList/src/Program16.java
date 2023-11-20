//Write a Java program to clone an array list to another array list.
import java.util.ArrayList;
import java.util.List;
public class Program16 {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");

        // Clone the ArrayList
        List<String> clonedList = new ArrayList<>(originalList);

        // Display original and cloned lists
        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);
    }
}
