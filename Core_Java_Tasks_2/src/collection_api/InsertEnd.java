package collection_api;
import java.util.LinkedList;

public class InsertEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");

        list.addLast("B");
        System.out.println("Updated List: " + list);
    }
}
