package Task_2;
import java.util.Scanner;
public class EmployeeLoanSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Employee emp = new Employee();
        
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Monthly Salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter Years Worked: ");
        int yearsWorked = scanner.nextInt();

        emp.setEmployeeDetails(id, name, salary, yearsWorked);
        emp.getEmployeeDetails();

        scanner.close();
    }
}