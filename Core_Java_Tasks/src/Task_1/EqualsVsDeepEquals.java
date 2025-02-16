package Task_1;
import java.util.Arrays;
public class EqualsVsDeepEquals {
    public static void main(String[] args) {
        String[] array1 = {"Java", "Python", "C++"};
        String[] array2 = {"Java", "Python", "C++"};
        
        System.out.println("Using equals(): " + Arrays.equals(array1, array2)); // true
        System.out.println("Using deepEquals(): " + Arrays.deepEquals(array1, array2)); // true

        Object[] nestedArray1 = {array1};
        Object[] nestedArray2 = {array2};

        System.out.println("Using equals() on nested arrays: " + Arrays.equals(nestedArray1, nestedArray2)); // false
        System.out.println("Using deepEquals() on nested arrays: " + Arrays.deepEquals(nestedArray1, nestedArray2)); // true
    }
}
