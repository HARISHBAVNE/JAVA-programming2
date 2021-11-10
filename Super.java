import java.lang.*;
class Base
{
	public int i;
	public Base(int no)
	{
		System.out.println("Inside Base constructor.");
		i = no;
	}
	public void fun()
	{
		System.out.println("Inside Base fun.");
	}
}
class Derived extends Base
{
	public int j;
	public Derived(int a,int b)
	{
		super(a);			//1
		System.out.println("Inside Derived constructor.");
		j = b;	
	}
	public void gun()
	{
		System.out.println("Inside Derived gun.");
		super.fun();		//2
		System.out.println("IValue of i:"+super.i);			//3
	}
}
class Super
{
	public static void main(String arg[])
	{
		Derived obj = new Derived(10,20);
		obj.gun();
	} 
}