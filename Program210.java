
import java.util.*;
class IPPackUnpack
{
	public int Packing (int no1,int no2,int no3,int no4)
	{
		int ans = 0;
		int i = no1<<24;
		int j = no2<<16;
		int k = no3<<8;
		int l = no4;
		ans = no1|no2|no3|no4;
		return ans;
		
	}
	
}

class Program210
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first number");
		int no1 = sobj.nextInt();
		System.out.println("Enter Second number");
		int no2 = sobj.nextInt();
		System.out.println("Enter Third number");
		int no3 = sobj.nextInt();
		System.out.println("Enter Fourth number");
		int no4 = sobj.nextInt();
		
		IPPackUnpack obj = new IPPackUnpack();
		int iRet = obj.Packing(no1,no2,no3,no4);
		System.out.println("Packed number is: "+iRet);
	}
}