package Task_1;
import java.util.Arrays;
class Student implements Comparable<Student> {
    private String name;
    private int[] marks;
    private int total;
    private double average;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateTotalAndAverage();
    }

    private void calculateTotalAndAverage() {
        total = Arrays.stream(marks).sum();
        average = total / (double) marks.length;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.total, this.total);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Total: %d, Average: %.2f", name, total, average);
    }
}