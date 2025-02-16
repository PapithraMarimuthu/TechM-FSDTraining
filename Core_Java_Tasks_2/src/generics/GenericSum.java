package generics;
import java.util.List;

public class GenericSum {
    public static <T extends Number> void sumEvenOdd(List<T> numbers) {
        double evenSum = 0, oddSum = 0;
        for (T num : numbers) {
            if (num.intValue() % 2 == 0) {
                evenSum += num.doubleValue();
            } else {
                oddSum += num.doubleValue();
            }
        }
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7);
        sumEvenOdd(numList);
    }
}
