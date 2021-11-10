import Marvellous.Matrix;
import java.util.*;

class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	public int Maximum()
	{
		int iMax = Arr[0][0];
		for (int i = 0;i<Arr.length;i++)
		{
			for (int j = 0;j<Arr[i].length;j++)
			{
				if(Arr[i][j]>iMax)
				{
					iMax = Arr[i][j];
				}
			}
		}
		return iMax;
	}
	public int Minimum()
	{
		int iMin = Arr[0][0];
		for (int i = 0;i<Arr.length;i++)
		{
			for (int j = 0;j<Arr[i].length;j++)
			{
				if(Arr[i][j]<iMin)
				{
					iMin = Arr[i][j];
				}
			}
		}
		return iMin;
	}
}
class Program220
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
		

		int Ret = dobj.Maximum();
		System.out.println("Largest element is:"+Ret);
		
		int Ret1 = dobj.Minimum();
		System.out.println("Smallest element is:"+Ret1);
		System.gc();
		
	}
}