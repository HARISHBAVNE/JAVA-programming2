import java.lang.*;

class Demo
{
	public int i;
	public Demo()
	{
		System.out.println("default constructor");
	}
	public Demo(int no)
	{
		this();
		System.out.println("Parameterised constructor");
		this.i = no;
	}
	public void fun()
	{
		System.out.println("Inside Fun");
		System.out.println(this.i);

	}
	public void gun()
	{
		System.out.println("Inside gun");
		this.fun();
	}
}
class ThisDemo
{
	public static void main(String arg[])
	{
		Demo obj = new Demo(11);
		obj.fun();
		obj.gun();
	} 
}