import java.lang.*;
import java.util.Scanner;
class Demo
{
	public boolean CheckPrime(int No)
	{
		int i = 0;
		for (i = 2;i<No;i++)
		{
			if (No%i == 0)
			{
				break;
			}
		}
		if (i == No)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Prime
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a number");
		int No = sobj.nextInt();
		Demo obj = new Demo();
		boolean bret = obj.CheckPrime(No);
		if (bret == true)
		{
			System.out.println("Number is prime.");
		}
		else
		{
			System.out.println("Number is Non-prime.");	
		}
	} 
}