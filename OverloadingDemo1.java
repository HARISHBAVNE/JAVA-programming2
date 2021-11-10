import java.lang.*;

class Demo
{
	public static void fun(int i,float j)
	{
		System.out.println("Inside Fun1");
		System.out.println(i+j);
	}
	public static void fun(float i,int j)
	{
		System.out.println("Inside Fun2");
		System.out.println(i+j);
	}
	public void gun(int i,int j)
	{
		System.out.println("Inside gun1");
		System.out.println(i+j);
	}
	public void gun(int i,int j,int k)
	{
		System.out.println("Inside gun2");
		System.out.println(i+j+k);
	}
	public void sun(int i,int j)
	{
		System.out.println("Inside sun1");
		System.out.println(i+j);
	}
	public void gun(float i,float j)
	{
		System.out.println("Inside sun2");
		System.out.println(i+j);
	}
}
class OverloadingDemo1
{
	public static void main(String arg[])
	{
		System.out.println("Inside Main");
		Demo obj = new Demo();
		obj.fun(10.5f,20);
		obj.fun(20,10.5f);
	}
}