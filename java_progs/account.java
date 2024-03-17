import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    // Constructor to initialize account details
    Account(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_no = input.nextInt();
        System.out.print("Enter balance: ");
        balance = input.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: Rs " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    // Constructor to initialize person details
    Person(int acc_no, double balance, String name, long aadhar_no) {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    @Override
    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class account {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create three persons
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Aadhar Number: ");
            long aadhar_no = input.nextLong();

            persons[i] = new Person(0, 0, name, aadhar_no);
            persons[i].input(); // Input account details
        }

        // Display details of all persons
        System.out.println("\nDetails of three persons:");
        for (Person person : persons) {
            person.disp();
            System.out.println();
        }
    }
}
