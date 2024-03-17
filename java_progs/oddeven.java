public class oddeven
{
    public static void main(String[] args)
    {
      int arr[]=new int[10];
      int e=0,o=0;
      System.out.println("Enter the numbers to be entered:");
      for (int i=0;i<arr.length;i++)
      {
        arr[i]= Integer.parseInt(args[i]);
        if(arr[i]%2==0)
        {
            e++;
        }
        else
        {
            o++;
        }
        }
            System.out.println("Even Number:"+e);
            System.out.println("Odd Number:"+o); 
    }
}