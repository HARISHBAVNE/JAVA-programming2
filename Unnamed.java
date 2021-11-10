import java.lang.*;

class Demo
{
	public int i,j;
	public static int x,y;

	{
		System.out.println("Inside Unnamed block.");
		j = 20;
		
	}
	static
	{
		System.out.println("Inside static block");
		x = 30;
	}
	public Demo()
	{
		System.out.println("Inside Constructor");
		i = 10;	
		y = 40;
	}
}
class Unnamed
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		System.out.println("i:"+obj.i);
		System.out.println("j:"+obj.j);
		System.out.println("x:"+Demo.x);
		System.out.println("y:"+Demo.y);
	} 
}