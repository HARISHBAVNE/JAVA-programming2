import java.util.*;
// 927 -> 18->9


class Digits
{
	boolean Armstrong(int iNo)
	{
		int temp = iNo;
		int Count = 0,iDigit=0,iSum = 0,iPower = 1;
		while(temp != 0)
		{
			temp = temp/10;
			Count ++;
		}
		temp = iNo;
		while(temp!=0)
		{
			iDigit = temp%10;
			for (int i = 1;i<Count;i++)
			{
				iPower = iPower * iDigit;
			}
			iSum = iSum + iPower;
			iPower = 1;
			temp = temp/10;
		}
		if (iSum == iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class program200
{
	public static void main(String arg[])
	{
		int no;
		boolean bret;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number");
		no = sobj.nextInt();
		
		Digits dobj = new Digits();
		bret = dobj.Armstrong(no);
		if (bret == true)
		{
			System.out.println("It is armstrong");
		}
		else
		{
			System.out.println("It is  not armstrong");
		}
		
	}
}