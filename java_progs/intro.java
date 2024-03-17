import java.util.Scanner;
public class intro
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    String name,Sec,Branch;
    int Roll;
    System.out.println("Enter the name of the student:");
    name=in.nextLine();
    System.out.println("Enter the section of the student");
    Sec=in.nextLine();
    System.out.println("Enter the Branch of the student:");
    Branch=in.nextLine();
    System.out.println("Enter the roll number of the student:");
    Roll=in.nextInt();
    System.out.println("Name:"+name);
    System.out.println("Roll Number:"+Roll);
    System.out.println("Section:"+Sec);
    System.out.println("Branch:"+Branch);
    }
}