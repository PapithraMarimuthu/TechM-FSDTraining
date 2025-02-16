package Task_1;
import java.util.Arrays;
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();
            int[] marks = new int[subjects];

            System.out.println("Enter marks:");
            for (int j = 0; j < subjects; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); 
            students[i] = new Student(name, marks);
        }

        Arrays.sort(students);

        System.out.println("\nSorted Student List:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}