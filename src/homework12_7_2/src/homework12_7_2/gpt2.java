package homework12_7_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gpt2 {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(7);

        // Print the unsorted list
        System.out.println("Unsorted List: " + numbers);

        // Use Collections utility class to sort the list
        Collections.sort(numbers);

        // Print the sorted list
        System.out.println("Sorted List: " + numbers);
    }
}
