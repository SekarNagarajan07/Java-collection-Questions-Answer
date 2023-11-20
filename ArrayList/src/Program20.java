// Write a Java program to increase the size of an array list.

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Program20 {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> myList = new ArrayList<>();

        // Add some elements to the ArrayList
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");

        // Display the original list and its capacity
        System.out.println("Original List: " + myList);
        System.out.println("Original Capacity: " + getCapacity(myList));

        // Increase the size of the ArrayList to a specific capacity
        int newCapacity = 10;
        myList = increaseCapacity(myList, newCapacity);

        // Add more elements to the list
        for (int i = 4; i <= newCapacity; i++) {
            myList.add("Item " + i);
        }

        // Display the list and its increased capacity
        System.out.println("List after increasing size: " + myList);
        System.out.println("Increased Capacity: " + getCapacity(myList));
    }
    private static int getCapacity(List<?> list) {
        if (list instanceof ArrayList) {
            try {
                Field dataField = ArrayList.class.getDeclaredField("elementData");
                dataField.setAccessible(true);
                return ((Object[]) dataField.get(list)).length;
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return -1; // If the list is not an ArrayList
    }

    private static <T> List<T> increaseCapacity(List<T> list, int newCapacity) {
        if (list instanceof ArrayList) {
            ((ArrayList<T>) list).ensureCapacity(newCapacity);
        }
        return list;
    }
}


