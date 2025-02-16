package exception_handling;
public class OddNumberExceptionExample {
    public static void checkEven(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Number is odd!");
        }
        System.out.println("Number is even: " + num);
    }

    public static void main(String[] args) {
        try {
            checkEven(5); // Change the number to test
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
