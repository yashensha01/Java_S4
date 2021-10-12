import java.util.Scanner;
public class program6
{
	public static void main (String args[])
	{
	Scanner s = new Scanner(System.in);
	String [] arr = new String[10];
	//System.out.println("Enter limit : ");
	//int lim = s.nextInt();
	System.out.println("Enter name : ");
	for (int i=0; i<10;i++)
	{
	arr[i] = s.next();
	}
	System.out.println("\n\nNames are : ");
	for (String a:arr)
	{
	System.out.println(""+a);
	}
		
	}
}
