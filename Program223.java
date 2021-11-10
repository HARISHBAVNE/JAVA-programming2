import Marvellous.Matrix;
import java.util.*;

class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	public void Forest()
	{
		int iSum = 0;
		for (int i = 0;i<Arr.length;i++)
		{
			
			for (int j = 0;j<Arr[i].length;j++)
			{
				if ((i!=0)||(i!=Arr[i].length-1)||(j != 0)||(j != Arr[i].length-1))
				{
					if()
					{

					}
				}
			}
			
		}
		System.out.println("Maximum element of row no"+(i+1)+":"+iSum);
	}
	
}
class Program223
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
		

		dobj.SummationRow();
		
		
		
		System.gc();
		
	}
}