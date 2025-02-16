package collection_api;
import java.util.LinkedList;

public class InsertFront {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");

        list.addFirst("A");
        System.out.println("Updated List: " + list);
    }
}
