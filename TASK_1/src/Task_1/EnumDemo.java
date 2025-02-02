package Task_1;
import java.util.Scanner;
//8. Enum Usage
enum DaysOfWeek {
 SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class EnumDemo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a day of the week: ");
     DaysOfWeek day = DaysOfWeek.valueOf(scanner.next().toUpperCase()); // Convert input to enum constant
     System.out.println(day == DaysOfWeek.SUNDAY ? "Holiday" : "Not Holiday");
 }
}
