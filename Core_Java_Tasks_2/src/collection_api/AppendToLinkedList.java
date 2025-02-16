package collection_api;
import java.util.LinkedList;

public class AppendToLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.addLast("C");

        System.out.println("Updated List: " + list);
    }
}
