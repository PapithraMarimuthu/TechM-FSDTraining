package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 22, 8, 37, 4, 99, 51);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println("Maximum Value: " + max.orElseThrow());
        System.out.println("Minimum Value: " + min.orElseThrow());
    }
}
