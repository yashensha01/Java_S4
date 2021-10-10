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
            System.out.print(arr[i]);
    }
}