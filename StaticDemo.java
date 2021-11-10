import java.lang.*;

class Demo
{
	public static int i;
	public int j;
	public int k;
	
	static{
		System.out.println("Inside static block");
		i = 10;
	}
	public Demo()
	{
		System.out.println("Inside Constructor");
		j = 20;
		k = 30;
	}
	public void fun()
	{
		System.out.println("Inside Fun");
		System.out.println("Value of i is:"+i);
		System.out.println("Value of j is:"+j);
		System.out.println("Value of k is:"+k);

	}
	public static void gun()
	{
		System.out.println("Inside gun");
		System.out.println("Value of i is:"+i);
		//System.out.println("Value of j is:"+j);		
	}
}
class StaticDemo
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		obj.fun();
		obj.gun();	
		Demo.gun();
		System.out.println("Value of i using class name:"+Demo.i);
		System.out.println("Value of j using class name:"+obj.j);
	} 
}