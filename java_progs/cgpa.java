import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    double cgpa;

    // Constructor to initialize student details
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int roll = input.nextInt();
            input.nextLine(); 
            System.out.print("Name: ");
            String studentName = input.nextLine();
            System.out.print("CGPA: ");
            double studentCgpa = input.nextDouble();

            students[i] = new Student(roll, studentName, studentCgpa);
        }
        double lowestCgpa = Double.MAX_VALUE;
        String lowestCgpaStudentName = "";

        for (Student student : students) {
            if (student.cgpa < lowestCgpa) {
                lowestCgpa = student.cgpa;
                lowestCgpaStudentName = student.name;
            }
        }
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Name: " + student.name);
            System.out.println("CGPA: " + student.cgpa);
            System.out.println();
        }
        System.out.println("Student with the lowest CGPA: " + lowestCgpaStudentName);
    }
}
