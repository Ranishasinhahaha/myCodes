import java.util.Scanner;
public class days
{
    public static void main(String args[])
    {
        int d,d1;
        d1=d1%7;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the day number:");
        d1=in.nextInt();
        if(d1==0)
        {
            System.out.println("Sunday");
            }
                break;
        
      if(d1==1)
      {
        System.out.println("Monday");
        }                                                                                                     break;
      
      if(d1==2)
      {
        System.out.println("Tuesday");
        }  break;
      
      if(d1==3)
      {
        System.out.println("Wednesday");
        }  break;
      
      if(d1==4)
      {
        System.out.println("Thursday");
        }  break;
      
      if(d1==5)
      {
        System.out.println("Friday");
        }  break;
      
      if(d1==6)
      {
        System.out.println("Saturday");
        }  break;
      
    }
}