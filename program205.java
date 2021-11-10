import java.util.*;

class StringX
{
	public int Display(String str)
	{
		char arr[] = str.toCharArray();
		int Count = 0;
		for (int i = 0;i<arr.length;i++)
		{
			if ((arr[i] >= 'A') && (arr[i]<='Z'))
			{
				Count ++;
			}
		}
		return Count;
	}
}

class program205
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("please enter a string");
		
		String str = sobj.nextLine();
		
		StringX obj = new StringX();
		int iRet = obj.Display(str);
		System.out.println("Number of capital letter is: "+iRet);
	}
}