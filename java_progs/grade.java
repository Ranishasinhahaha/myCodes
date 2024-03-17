import java.util.Scanner;
public class grade
{
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    int a;
    System.out.println("Enter the marks received by the student:");
    a=in.nextInt();
    if(a>=90)
    {
        System.out.println("Grade received: O");
    }
    else if(a<90&&a>=80)
    {
        System.out.println("Grade received: E");
    }
    else if(a<80&&a>=70)
    {
        System.out.println("Grade received: A");
    }
    else if(a<70&&a>=60)
    {
        System.out.println("Grade received: B");
    }
    else
    {
        System.out.println("Grade received: C");
    }
}
}