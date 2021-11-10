import java.lang.*;
import java.util.*;

class Display
{
	public void Pattern(int Row,int Col)
	{
		if (Row != Col)
		{
			return;
		}
		for (int i=0;i<Row;i++)
		{
			for (int j = 0;j<=i;j++)
			{
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}
}
class Pattern2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int Row = sobj.nextInt();
		System.out.print("Enter number of columns:");
		int Col = sobj.nextInt();
		Display obj = new Display();
		obj.Pattern(Row,Col);
	}
}