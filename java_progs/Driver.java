import java.util.Scanner;

abstract class Student {
    int rollNo;
    String regNo;

    Student(int rollNo, String regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    abstract void course();
}

class KiiTian extends Student {
    String courseName;

    KiiTian(int rollNo, String regNo, String courseName) {
        super(rollNo, regNo);
        this.courseName = courseName;
    }

    void course() {
        System.out.println("Course Name: " + courseName);
    }
}

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = in.nextInt();
        in.nextLine();
        System.out.print("Enter Registration Number: ");
        String regNo = in.nextLine();
        System.out.print("Enter Course Name: ");
        String courseName = in.nextLine();

        KiiTian kiitian = new KiiTian(rollNo, regNo, courseName);

        System.out.println("\nKiiTian Details:");
        System.out.println("Roll Number: " + kiitian.rollNo);
        System.out.println("Registration Number: " + kiitian.regNo);
        kiitian.course();
    }
}
