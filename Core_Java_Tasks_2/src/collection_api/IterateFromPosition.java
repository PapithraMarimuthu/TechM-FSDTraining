package collection_api;
import java.util.LinkedList;

public class IterateFromPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
