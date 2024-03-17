public class largest
{
    public static void main(String[] args)
    {
        int arr[]= new int[10];
        int l=0;
        System.out.println("Enter the numbers:");
        for(int i=0;i<10;i++)
        {
            arr[i]= Integer.parseInt(args[i]);
            if(arr[i]>l)
            {
                l=arr[i];
            }
        }
        System.out.println("Largest Element:"+l);
    }
}