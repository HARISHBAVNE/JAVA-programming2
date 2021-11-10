import java.lang.*;

class Demo
{
	public void fun()
	{
		for (int i = 1;i<11;i++)
		{
			System.out.println(i);
		}
	}
}
class Hello
{
	public void fun()
	{
		for (int i = 1;i<11;i++)
		{
			System.out.println(i);
		}
	}
}

class Multitasking
{
	public static void main(String arg[]) 
	{
		System.out.println("Main thread name is:"+Thread.currentThread().getName());
		Demo obj1 = new Demo();
		Hello obj2 = new Hello();
		obj1.fun();
		obj2.fun();
	}
}