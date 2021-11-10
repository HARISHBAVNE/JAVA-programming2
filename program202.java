import java.util.*;

class Numbers
{
	public int Sum(int Arr[])
	{
		int iSum = 0,iSum1 = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			for (int j = 1;j<=Arr[i]/2;j++)
			{
				
				if (Arr[i]%j == 0)
				{
					iSum1 = iSum1+j;
					 
				}
			}
			if (iSum1 == Arr[i])
			{
				iSum = iSum + iSum1; 
			}
			iSum1 = 0;
		}
		return iSum;
	}
		
}

class program202
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner (System.in);
		int iSize = 0;
		System.out.println("Enter number of elements\n");
		iSize = sobj.nextInt();
		
		int Arr[] = new int[iSize];
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