import java.util.*;
class Matrix
{
	
	
}

class Program213
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();
		
		int Arr[][] = new int[row][col];
		
		System.out.println("Enter the element");
		
		for (int i = 0;i<Arr.length;i++)		//Rows
		{
			
			for (int j = 0;j<Arr[i].length;j++)		//Col.
			{
				Arr[i][j] = sobj.nextInt();
			}
		}
		System.out.println("Entered element are");
		for (int i = 0;i<Arr.length;i++)		//Rows
		{
			
			for (int j = 0;j<Arr[i].length;j++)		//Col.
			{
				System.out.print(Arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		Arr  = null;
	}
	
}