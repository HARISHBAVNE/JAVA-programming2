import java.lang.*;
import java.util.*;

class Marks
{
	Scanner sobj = new Scanner(System.in);
	public int marks;
	public int arr[];
	public Marks(int marks)
	{
		this.marks = marks;
		this.arr = new int[marks];
	}

	public void array()
	{
		for (int i = 0;i<arr.length;i++)
		{
			System.out.print("Enter subjcet"+(i+1)+" marks:");
			arr[i] = sobj.nextInt();
		}
	}
	public void Display()
	{
		for (int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void Per()
	{
		int total = 0;
		for (int i = 0;i<arr.length;i++)
		{
			total = total + arr[i];
		}
		float percentage = (float) total/marks ;
		System.out.print("You got:"+percentage+"%");
	}
}

class Result
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("How many subjects:");
		int iSize = sobj.nextInt();

		Marks obj = new Marks(iSize);
		obj.array();
		obj.Display();
		obj.Per();

	}
}