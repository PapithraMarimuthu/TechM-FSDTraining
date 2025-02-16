package collection_api;
import java.util.LinkedList;

public class InsertFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");

        list.addFirst("A");
        list.addLast("C");

        System.out.println("Updated List: " + list);
    }
}
