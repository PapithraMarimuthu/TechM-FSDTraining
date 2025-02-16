package threads;
public class MultiThreadPrimeSum {
    public static void main(String[] args) throws InterruptedException {
        int limit = 100;
        int mid = limit / 2;

        PrimeSumThread t1 = new PrimeSumThread(1, mid);
        PrimeSumThread t2 = new PrimeSumThread(mid + 1, limit);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long totalSum = t1.getSum() + t2.getSum();
        System.out.println("Sum of prime numbers up to " + limit + " is: " + totalSum);
    }
}
