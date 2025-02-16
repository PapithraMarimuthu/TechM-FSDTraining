package streams;
import java.util.Arrays;
import java.util.List;

public class CountStringWithLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");

        long count = words.stream()
                          .filter(word -> word.startsWith("a"))
                          .count();

        System.out.println("Count of words starting with 'a': " + count);
    }
}
