package Task_1;
import java.util.Arrays;
public class AlternateElementsCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int newArraySize = (originalArray.length + 1) / 2;
        int[] alternateArray = new int[newArraySize];

        for (int i = 0, j = 0; i < originalArray.length; i += 2, j++) {
            alternateArray[j] = originalArray[i];
        }

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Alternate Elements Copied: " + Arrays.toString(alternateArray));
    }
}