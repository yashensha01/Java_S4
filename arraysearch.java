import java.util.Scanner;
public class arraysearch
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[99];
        int i,searchKey;
        System.out.println("Enter Array limit :");
        int arrayLength = s.nextInt();
        System.out.println("Enter Array Elements :");
        for(i=0;i<arrayLength;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter Number to be searched :");
        searchKey = s.nextInt();
        for(i=0;i<arrayLength;i++)
        {
            if(arr[i]==searchKey)
         {
             if(i==0)
             {
            System.out.println("Search key is found in "+(i+1)+"st position.");
                 break;
             }
             else if (i==1)
             {
            System.out.println("Search key is found in "+(i+1)+"nd position.");
                 break;
             }
             else if(i==2)
             {
            System.out.println("Search key is found in "+(i+1)+"rd position.");
                 break;
             }
             else{
            System.out.println("Search key is found in "+(i+1)+"th position.");
            break;
             }
       
        }
        }
        s.close();

    }
}