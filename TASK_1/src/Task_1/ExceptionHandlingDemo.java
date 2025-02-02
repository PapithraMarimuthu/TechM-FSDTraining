package Task_1;
import java.util.*;
//4. Exception Handling
class ExceptionHandlingDemo {
 // Method to process user input and handle exceptions
 public static void processInput() {
     Scanner scanner = new Scanner(System.in);
     try {
         System.out.print("Enter a number: ");
         double num = scanner.nextDouble(); // User input for a number
         System.out.println("Reciprocal: " + (1 / num)); // Calculate reciprocal
     } catch (InputMismatchException e) {
         System.out.println("Invalid input. Please enter a valid number.");
     } catch (ArithmeticException e) {
         System.out.println("Cannot divide by zero.");
     }
 }

 public static void main(String[] args) {
     processInput(); // Calling the method to process user input
 }
}

