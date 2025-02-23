package core;

import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double sal;
    private int yearsOfService;

    // to set employee details
    public void setEmployeeDetails(int empId, String empName, double sal, int yearsOfService) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsOfService = yearsOfService;
    }

    // to get employee details
    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Monthly Salary: " + sal);
        System.out.println("Annual Salary: " + (sal * 12));
        System.out.println("Years of Service: " + yearsOfService);
    }

    // Method to check loan eligibility
    public double getLoanEligibility() {
        if (yearsOfService > 5) {
            double annualSalary = sal * 12;
            if (annualSalary >= 15_00_000) {
                return 7_00_000;
            } else if (annualSalary >= 10_00_000) {
                return 5_00_000;
            } else if (annualSalary >= 6_00_000) {
                return 2_00_000;
            }
        }
        return 0; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        // Taking employee details 
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        scanner.nextLine(); // Consume newline
        String empName = scanner.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double sal = scanner.nextDouble();

        System.out.print("Enter Years of Service: ");
        int yearsOfService = scanner.nextInt();

        emp.setEmployeeDetails(empId, empName, sal, yearsOfService);

        // employee details
        System.out.println("\nEmployee Details:");
        emp.getEmployeeDetails();

        // Check  loan eligibility
        double loanAmount = emp.getLoanEligibility();
        if (loanAmount > 0) {
            System.out.println("Eligible for a loan of: " + loanAmount);
        } else {
            System.out.println("Not eligible for a loan.");
        }

        scanner.close();
    }
}


