import java.util.*;

class Numbers
{
	public int Sum(int Arr[])
	{
		int iSum = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			iSum = iSum + Arr[i];
			
		}
		return iSum;
		
	}
	
}

class program201
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner (System.in);
		int iSize = 0;
		System.out.println("Enter number of elements\n");
		iSize = sobj.nextInt();
		
		int arr[] = new int[iSize];
		System.out.println("please enter the values");
		for (int i = 0;i <Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
		Numbers nobj = new Numbers();
		int iRet = nobj.Sum(Arr);
		System.out.println("Addition of n numnber is:"+iRet);
	}
}