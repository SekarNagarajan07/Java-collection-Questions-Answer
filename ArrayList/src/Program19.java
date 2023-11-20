//Write a Java program to trim the capacity of an array list the current list size.
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Program19 {
    public static void main(String[] args) throws Exception{
        // Create an ArrayList
        List<String> myList = new ArrayList<>();

        // Add some elements to the ArrayList
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");

        // Display the original list and its capacity
        System.out.println("Original List: " + myList);
        System.out.println("Original Capacity: " + getCapacity(myList));

        // Trim the capacity to the current size
        myList = new ArrayList<>(myList);

        // Display the list and its trimmed capacity
        System.out.println("List after trimming: " + myList);
        System.out.println("Trimmed Capacity: " + getCapacity(myList));
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
}
