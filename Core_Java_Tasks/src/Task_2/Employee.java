package Task_2;
class Employee {
    private int empId;
    private String empName;
    private double salary;
    private int yearsWorked;

    public void setEmployeeDetails(int empId, String empName, double salary, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    public void getEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.printf("Monthly Salary: %.2f\n", salary);
        System.out.printf("Annual Salary: %.2f\n", getAnnualSalary());
        System.out.println("Years Worked: " + yearsWorked);
        System.out.println("Loan Eligibility: " + getLoanEligibility() + " INR");
    }

    private double getAnnualSalary() {
        return salary * 12;
    }

    public double getLoanEligibility() {
        if (yearsWorked <= 5) {
            return 0;
        }
        double annualSalary = getAnnualSalary();
        if (annualSalary >= 15_00_000) {
            return 7_00_000;
        } else if (annualSalary >= 10_00_000) {
            return 5_00_000;
        } else if (annualSalary >= 6_00_000) {
            return 2_00_000;
        }
        return 0;
    }
}