package collection_api;
import java.util.LinkedList;

public class InsertAtPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("C");

        list.add(1, "B");
        System.out.println("Updated List: " + list);
    }
}
