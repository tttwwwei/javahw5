
package homework12_7_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gpt1 {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        // Print the original list
        System.out.println("Original List: " + numbers);

        // Sort the list
        Collections.sort(numbers);

        // Print the sorted list
        System.out.println("Sorted List: " + numbers);

        // Find the sum of elements in the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Print the sum
        System.out.println("Sum of List Elements: " + sum);
    }
}
