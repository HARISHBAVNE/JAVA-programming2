import java.lang.*;
import java.util.*;

class Display
{
	public void Pattern(int no)
	{
		int i = 0;
		for (i = 0;i<no;i++)
		{
			System.out.print("*"+"\t");
		}
	}
}
class Pattern1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("How many times you want to print *");
		int No = sobj.nextInt();
		Display obj = new Display();
		obj.Pattern(No);
	}
}