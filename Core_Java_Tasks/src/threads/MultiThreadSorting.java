package threads;
public class MultiThreadSorting {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 6};
        SortThread sortThread = new SortThread(numbers);
        sortThread.start();
    }
}
