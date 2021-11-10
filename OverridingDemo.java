import java.lang.*;

class Base
{
	public void fun()
	{
		System.out.println("Inside Base fun");
	}
	public void gun()
	{
		System.out.println("Inside Base gun");
	}

}
class Derived extends Base
{
	public void fun()
	{
		System.out.println("Inside Derived fun");
	}
	public void sun()
	{
		System.out.println("Inside Derived sun");
	}
}

class OverridingDemo
{
	public static void main(String arg[])
	{
		System.out.println("Inside Main");
		Base obj = new Derived();
		obj.fun();
		obj.gun();
		//obj.sun();
	}
}