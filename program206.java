import java.util.*;
//"abcde" "cebad"
class StringX
{
	public boolean Display(String str1,String str2)
	{
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		int Count = 0;
		for (int i = 0;i<arr1.length;i++)
		{
			
			
		}
		return Count;
	}
}

class program205
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("please enter first string");
		
		String str1 = sobj.nextLine();
		
		System.out.println("please enter second string");
		
		String str2 = sobj.nextLine();
		StringX obj = new StringX();
		
		boolean bret = obj.CheckAnagram(str1,str2);
		
		}
}