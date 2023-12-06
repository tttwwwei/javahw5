package homework12_7_2;

import java.util.ArrayList;

public class gpt3 {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Print the elements
        System.out.println("Fruits: " + fruits);

        // Remove an element
        fruits.remove("Banana");

        // Print the updated list
        System.out.println("Updated Fruits: " + fruits);
    }
}
