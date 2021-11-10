import java.lang.*;

class Demo
{
	public int i;
	public static int j;
	static
	{
		System.out.println("Inside static block");
		j = 20;
	}
	public Demo()
	{
		System.out.println("Inside Constructor");
		i = 10;
		
	}
}


class StaticBlock
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		System.out.println(obj.i);
		System.out.println(Demo.j);
	}
}