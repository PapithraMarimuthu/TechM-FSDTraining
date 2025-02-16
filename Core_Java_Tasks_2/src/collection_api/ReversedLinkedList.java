package collection_api;
import java.util.LinkedList;
import java.util.Collections;

public class ReversedLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}
