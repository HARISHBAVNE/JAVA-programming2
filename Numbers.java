import java.lang.*;
import java.util.*;
class Pattern
{
	public void Display(int no)
	{
		for(int i = no;i>0;i--)
		{
			System.out.print(i+"\t");
		}
	}
}

class Numbers
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int Value = 0;
		System.out.println("Enter a number:");
		Value = sobj.nextInt();
		Pattern obj = new Pattern();
		obj.Display(Value);
	}
}
