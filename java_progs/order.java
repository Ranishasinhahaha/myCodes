import java.util.Scanner;
public class order
{
    public static void main(String args[])
    {
        int temp=0,n=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int k=0;k<n;k++)
        {
           arr[k]=in.nextInt(); 
        }
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            System.out.println();
        }
        System.out.println("Arranged in Ascending order:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}