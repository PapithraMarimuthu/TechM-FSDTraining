package Task_1;
//3. Division without '/' or '*'
class DivisionDemo {
 public static void main(String[] args) {
     int dividend = 17, divisor = 5;
     int quotient = 0;
     int remainder = dividend;

     // Repeated subtraction to find quotient and remainder instead of using '/' or '*'
     while (remainder >= divisor) {
         remainder -= divisor; // Subtract divisor from remainder
         quotient++; // Increase quotient by 1 for each subtraction
     }
     System.out.println("Quotient: " + quotient); // Output the quotient
     System.out.println("Remainder: " + remainder); // Output the remainder
 }
}
