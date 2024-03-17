import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        System.out.println("Menu for Subtraction:");
        System.out.println("1. Between Integers");
        System.out.println("2. Between Floats");
        System.out.println("3. Between Integers and Floats");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the type of subtraction: ");
        int type = input.nextInt();
        
        switch (type) {
            case 1:
            {
                System.out.print("Enter the first number: ");
                int a = input.nextInt();
                System.out.print("Enter the second number: ");
                int b = input.nextInt();
                Subtraction subInt = new Subtraction(a, b);
                System.out.println("Result: "+ subInt.subtractInt(a, b));
                break;
            }
            case 2:
            {
                System.out.print("Enter the first number: ");
                double c = input.nextDouble();
                System.out.print("Enter the second number: ");
                double d = input.nextDouble();
                Subtraction subFloat = new Subtraction(c, d);
                System.out.println("Result: "+ subFloat.subtractDouble(c, d));
                break;
            }
            case 3:
            {
                System.out.print("Enter the first number: ");
                int e = input.nextInt();
                System.out.print("Enter the second number: ");
                double f = input.nextDouble();
                Subtraction sub = new Subtraction(e, f);
                System.out.println("Result: "+ sub.subtractIntAndDouble(e, f));
                break;
            }
            default:
                System.out.println("Invalid input");
        }
    }
}
class Subtraction {
    int a, b;
    double c, d;
    Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
    }
    Subtraction(double c, double d) {
        this.c = c;
        this.d = d;
    }
    Subtraction(int e, double f) {
        this.a = e;
        this.c = f;
    }

    int subtractInt(int a, int b) {
        return a - b;
    }

    double subtractDouble(double c, double d) {
        return c - d;
    }

    double subtractIntAndDouble(int e, double f) {
        return e - f;
    }

}