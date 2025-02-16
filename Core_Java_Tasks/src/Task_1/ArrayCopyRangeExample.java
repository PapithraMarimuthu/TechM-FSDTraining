package Task_1;
import java.util.Arrays;

public class ArrayCopyRangeExample {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50, 60, 70, 80};
        int startIndex = 2;
        int endIndex = 6;
        
        int[] copiedArray = Arrays.copyOfRange(originalArray, startIndex, endIndex);
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Range: " + Arrays.toString(copiedArray));
    }
}
