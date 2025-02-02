package Task_1;
//7. Primitive vs Reference Variables
class ReferenceDemo {
 // Method to demonstrate the difference between primitive and reference variables
 static void modify(int num, int[] arr) {
     num += 5; // Primitive variable - no effect on original num
     arr[0] += 5; // Reference variable - modifies the original array
 }

 public static void main(String[] args) {
     int num = 10;
     int[] arr = {10};
     modify(num, arr); // Call modify method
     System.out.println("Integer after method: " + num); // Output the original num (unchanged)
     System.out.println("Array first element after method: " + arr[0]); // Output the modified array element
 }
}
