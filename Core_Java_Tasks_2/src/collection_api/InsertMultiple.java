package collection_api;
import java.util.LinkedList;
import java.util.List;

public class InsertMultiple {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("D");

        list.addAll(1, List.of("B", "C"));
        System.out.println("Updated List: " + list);
    }
}
