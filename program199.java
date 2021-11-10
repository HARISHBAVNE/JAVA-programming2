import java.util.*;
// 927 -> 18->9


class Digits
{
	int GenRoot(int iNo)
	{
		int sum = iNo;
		while(sum > 9)
		{
			iNo = sum;
			sum = 0;
			while(iNo !=0)
			{
				sum = sum + (iNo%10);
				iNo = iNo/10;
			}
			
		}
		return sum;
	}
	
}

class Program199
{
	public static void main(String arg[])
	{
		int no,ret;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number");
		no = sobj.nextInt();
		
		Digits dobj = new Digits();
		ret = dobj.GenRoot(no);
		System.out.println("Generic root is : "+ret);
	}
}