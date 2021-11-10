import java.lang.*;
import java.util.*;
class Length
{
	public int CalLength(String str)
	{
		return str.length();
	}
}

class Name
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter name:");
		String str  = sobj.nextLine();
		Length obj = new Length();
		int iret = obj.CalLength(str);
		System.out.print("Number of letters in name:"+iret);

	}
}
