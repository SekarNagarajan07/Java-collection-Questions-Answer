//Write a Java program to iterate through all elements in an array list.
import java.util.ArrayList;
class Program2 {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Grapes");
        fruitsList.add("Mango");

        // Iterate through all elements in the ArrayList using a for-each loop
        System.out.println("Iterating through elements using for-each loop:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        // Alternatively, iterate using a traditional for loop
        System.out.println("\nIterating through elements using traditional for loop:");
        for (int i = 0; i < fruitsList.size(); i++) {
            System.out.println(fruitsList.get(i));
        }
    }
}
