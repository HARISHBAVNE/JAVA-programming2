import java.util.*;



class Program229
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String str = sobj.nextLine();
		System.out.println("String length is: "+str.length());
		String temp = str.trim().replaceAll("[]{2.}"," ");
		System.out.println(" new String length after removing extra whitespace is: "+temp.length());

		System.out.println("Modified string is: "+temp);
	}
}