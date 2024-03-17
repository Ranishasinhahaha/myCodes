 import java.util.Scanner;
class TwoD
   {
    double area; 

    TwoD(double area) 
    {
        this.area = area;
    }
}

class ThreeD extends TwoD {
    double height; 

    ThreeD(double area, double height)
     {
        super(area);
        this.height = height;
    }

    double calculateCost() {
    
        double sheetCost = area * 40;
        double boxCost = area * height * 60;

        return sheetCost + boxCost;
    }
}

class TwoD1
 {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the area of the 2D sheet (in square feet):");
        double sheetArea = in.nextDouble();

        System.out.println("Enter the height of the 3D box (in feet):");
        double boxHeight = in.nextDouble();

        ThreeD plastic = new ThreeD(sheetArea, boxHeight);
        double totalCost = plastic.calculateCost();

        System.out.println("Total cost of plastic: Rs " + totalCost);
    }
}