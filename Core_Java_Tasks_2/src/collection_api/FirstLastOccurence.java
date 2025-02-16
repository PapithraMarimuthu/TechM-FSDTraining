package collection_api;
import java.util.LinkedList;

public class FirstLastOccurence {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("A");

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }
}
