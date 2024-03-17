import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius for circle:");
        double radius = scanner.nextDouble();
        System.out.println("Area of Circle: " + area(radius));

        System.out.println("Enter base and height for triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Area of Triangle: " + area(base, height));

        System.out.println("Enter side for square:");
        double side = scanner.nextDouble();
        System.out.println("Area of Square: " + areaSquare(side));
    }

    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static double areaSquare(double side) {
        return Math.pow(side, 2);
    }
}
