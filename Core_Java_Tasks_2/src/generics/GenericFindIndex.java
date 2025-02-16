package generics;
import java.util.List;

public class GenericFindIndex {
    public static <T> int findFirstIndex(List<T> list, T target) {
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Cherry", "Apple");
        System.out.println("Index of 'Cherry': " + findFirstIndex(words, "Cherry")); // 2
        System.out.println("Index of 'Mango': " + findFirstIndex(words, "Mango")); // -1
    }
}
