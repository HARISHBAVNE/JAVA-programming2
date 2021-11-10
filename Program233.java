import java.util.*;

class Demo
{
	public void MaxWord(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[] = temp.split(" ");
		int imax = Arr[0].length();
		int index = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			if ((Arr[i].length()>imax))
			{
				imax = Arr[i].length();
				index = i;
			}
		}
		System.out.println(Arr[index]);

	}
}

class Program233
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String str = sobj.nextLine();
		Demo dobj = new Demo();
		dobj.MaxWord(str);
		
	}
}