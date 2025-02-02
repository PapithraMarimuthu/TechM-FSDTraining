package Task_1;
//9. Factorial Trailing Zeroes
class FactorialZeroes {
 // Method to count the number of trailing zeroes in the factorial of a number
 public static int countTrailingZeroes(int n) {
     int count = 0;
     for (int i = 5; n / i >= 1; i *= 5) { // Count factors of 5 in factorial
         count += n / i;
     }
     return count; // Return the count of trailing zeroes
 }
}
