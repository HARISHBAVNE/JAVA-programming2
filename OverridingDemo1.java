import java.lang.*;

class Base
{
	public static void fun()
	{
		System.out.println("Inside Base fun");
	}
	public void sun()
	{
		System.out.println("Inside Base sun");
	}
	
}
class Derived extends Base
{
	public static void fun()
	{
		System.out.println("Inside Derived fun");
	}
	public void sun()
	{
		System.out.println("Inside Derived sun");
	}
}

class OverridingDemo1
{
	public static void main(String arg[])
	{
		System.out.println("Inside Main");
		Base obj = new Derived();
		obj.fun();
		obj.sun();
	}
}