import Marvellous.Matrix;
import java.util.*;

class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	public void Maximum()
	{
		int iMax = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			iMax = Arr[i][0];
			for (int j = 0;j<Arr[i].length;j++)
			{
				if(Arr[i][j]>iMax)
				{
					iMax = Arr[i][j];
				}
			}
			System.out.println("Maximum element of row no"+(i+1)+":"+iMax);
		}
	}
	
}
class Program221
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
		

		dobj.Maximum();
		
		
		
		System.gc();
		
	}
}