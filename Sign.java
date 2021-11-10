import java.lang.*;
import java.util.*;
class CheckSign
{
	public void Display(int no)
	{
		if (no < 0)
		{
			System.out.println("Number is Negative.");
		}
		else if (no > 0)
		{
			System.out.println("Number is Positive.");	
		}
		else
		{
			System.out.println("Number is Zero.");	
		}
	}
}

class Sign
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int Value = 0;
		System.out.println("Enter a number:");
		Value = sobj.nextInt();
		CheckSign obj = new CheckSign();
		obj.Display(Value);
	}
}
