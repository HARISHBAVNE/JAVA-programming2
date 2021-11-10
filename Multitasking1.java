import java.lang.*;

class Demo extends Thread
{
	public void run()
	{
		for (int i=1;i<11;i++)
		{
			System.out.println("Thread name is:"+Thread.currentThread().getName()+i);
		}
	}
}
class Hello
{
	public void fun()
	{
		for (int i = 'A';i<27;i++)
		{
			System.out.println(i);
		}
	}
}

class Multitasking1
{
	public static void main(String arg[]) 
	{
		System.out.println("Main thread name is:"+Thread.currentThread().getName());
		Demo obj1 = new Demo();
		Demo obj2 = new Demo();
		//Hello obj2 = new Hello();
		Thread t1 = new Thread(obj1,"First");
		Thread t2 = new Thread(obj1,"Second");
		t1.start();
		t2.start();
	}
}