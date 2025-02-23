package core;
import java.util.*;
class Student {
    String name;
    int[] marks;
    int total;
    double average;
   public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateTotalAndAverage();
    }
   private void calculateTotalAndAverage() {
        total = Arrays.stream(marks).sum();
        average = (double) total / marks.length;
    }
}
public class StudentMarksSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();
      List<Student> students = new ArrayList<>();
       for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
       System.out.print("Enter the number of subjects: ");
            int subjects = scanner.nextInt();
            int[] marks = new int[subjects];

            System.out.println("Enter marks for " + name + ":");
            for (int j = 0; j < subjects; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine();

            students.add(new Student(name, marks));
        }

        students.sort((s1, s2) -> Integer.compare(s2.total, s1.total));

        System.out.println("\nSorted Student List (by Total Marks):");
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Total: " + s.total + ", Average: " + String.format("%.2f", s.average));
        }

        scanner.close();
    }
}


