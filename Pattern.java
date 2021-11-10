import java.lang.*;
import java.util.*;

class DisplayM
{
	public void Display(int no)
	{
		int i = 0;
		for (i = 0;i<no;i++)
		{
			System.out.println("Marvellous");
		}
	}
}
class Pattern
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("How many times you want to print message");
		int No = sobj.nextInt();
		DisplayM obj = new DisplayM();
		obj.Display(No);
	}
}