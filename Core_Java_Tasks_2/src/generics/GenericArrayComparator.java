package generics;
import java.util.Arrays;

public class GenericArrayComparator {
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {1, 2, 3, 4};
        String[] arr3 = {"A", "B", "C"};
        String[] arr4 = {"A", "B", "D"};

        System.out.println("Are arrays equal? " + areArraysEqual(arr1, arr2)); // true
        System.out.println("Are arrays equal? " + areArraysEqual(arr3, arr4)); // false
    }
}
