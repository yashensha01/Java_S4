import java.util.Scanner;
public class arraysort
{
    public static void main (String args[])
    {
        Scanner s = new Scanner (System.in);
        int [] arr = new int[99];
        int i,j,temp;
        System.out.println("Enter Array length");
        int arrayLength = s.nextInt();
        System.out.println("Enter Array Elements");
        for (i=0; i<arrayLength;i++ )
            arr [i] = s.nextInt();
        for (i=0; i<arrayLength;i++ )
        {
            for(j=0;j<arrayLength;j++)
            {
                if(arr[i]<arr[j])
                {
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                }
            }
        }
        System.out.println("Sorted elements are :");
        for(i=0;i<arrayLength;i++)
        {
            System.out.print(arr[i]+" ");
        }
    s.close();
    }
}