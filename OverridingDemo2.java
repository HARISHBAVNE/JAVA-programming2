import java.lang.*;

class Base
{
	private void sun()
	{
		System.out.println("Inside sun1");
	}
	private void sun(int a)
	{
		System.out.println("Inside sun2");
	}
	public void fun()
	{
		System.out.println("Inside sun");
		sun(2);
	}
}

class Derived extends Base
{
	private void sun()
	{
		System.out.println("Inside sun1");
	}
	public void gun(int a)
	{
		System.out.println("Inside gun");
		sun();
	}
}
class OverridingDemo2
{
	public static void main(String arg[])
	{
		System.out.println("Inside Main");
		Derived obj = new Derived();
		obj.gun(5);
	}
}