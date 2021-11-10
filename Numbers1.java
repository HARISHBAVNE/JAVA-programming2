import java.lang.*;
import java.util.*;
class Number
{
	public int Add(int Arr[])
	{
		int iSum = 0;
		for(int i = 0;i>Arr.length;i++)
		{
			iSum = iSum + Arr[i];
		}
		return iSum;
	}
}

class Numbers1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int Size = 0;
		System.out.println("Enter a size of array:");
		Size = sobj.nextInt();
		int Arr[] = new int[Size];
		System.out.println("Enter elements");
		for (int i = 0;i<Arr.length;i++)
		{
			System.out.print("Element "+(i+1));
			Arr[i] = sobj.nextInt();
		}
		Number obj = new Number();
		int iRet = obj.Add(Arr);
		System.out.print("Addition of all numbers:"+iRet);

	}
}
