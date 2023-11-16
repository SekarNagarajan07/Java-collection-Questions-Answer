// Write a Java program to create a new array list, add some colors (string) and print out the
//collection.

import java.util.ArrayList;
class Program1 {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colorsList = new ArrayList<>();

        // Add some colors to the ArrayList
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Yellow");
        colorsList.add("Orange");

        // Print out the collection
        System.out.println("Colors in the ArrayList:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}
