// Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;
class Program3 {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Grapes");
        fruitsList.add("Mango");

        // Print the original ArrayList
        System.out.println("Original ArrayList:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        // Insert a new element at the first position
        String newFruit = "Apple";
        fruitsList.add(0, newFruit);

        // Print the updated ArrayList
        System.out.println("\nArrayList after inserting '" + newFruit + "' at the first position:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}
