import java.util.Scanner;
public class name
{
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        String s,s1;
        System.out.println("Enter the first name:");
        s=in.nextLine();
        System.out.println("Enter the last name:");
        s1=in.nextLine();
        System.out.println("Last name + First name:");
        System.out.println(" "+s1+" "+s);
    }
}