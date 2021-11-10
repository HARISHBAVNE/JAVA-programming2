import Marvellous.Matrix;
import java.util.*;

class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	int Addition()
	{
		int iSum = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			for (int j = 0;j<Arr[i].length;j++)
			{
				iSum = iSum + Arr[i][j];
			}
		}
		return iSum;
	}
}
class Program218
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();
		
		Demo dobj = new Demo(row,col);
		dobj.Accept();
		dobj.Display();
		

		int Ret = dobj.Addition();
		System.out.println("Addition of element is:"+Ret);
		
		System.gc();
		
	}
}