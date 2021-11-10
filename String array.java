import java.util.*;
import java.io.*;
class Demo
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = new String[5];
		for (int i = 0;i<5;i++)
		{
			System.out.println("Enter a string"+(i+1));
			s[i] = br.readLine();
		}
		for (int i = 0;i<5;i++)
		{
			System.out.println(s[i]);
		}
	}
}