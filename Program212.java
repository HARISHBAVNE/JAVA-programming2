
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
	public void Unpacking (int no)
	{
		int no1,no2,no3,no4;
		no1 = no & 0x000000ff;
		no2 = no>> 8;
		no2 = no & 0x000000ff;
		no3 = no>>16;
		no3 = no & 0x000000ff;
		no4 = no>>24;
		System.out.println("First Number: "+no1);
		System.out.println("Second Number: "+no2);
		System.out.println("Third Number: "+no3);
		System.out.println("Fourth Number: "+no4);
	}
	
}

class Program211
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
		unsigned int iRet = obj.Packing(no1,no2,no3,no4);
		System.out.println("Packed number is: "+iRet);
	}
}