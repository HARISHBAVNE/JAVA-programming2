import java.lang.*;

class Demo extends Thread
{
	public void run()
	{
		
		task1();
		//task2();
	}
	public void task1()
	{
		for (int i=1;i<5;i++)
		{
			System.out.println("Thread name is:"+Thread.currentThread().getName()+i);
		}
	}
	/*public void task2()
	{
		for (int i = 'A';i<'E';i++)
		{
			System.out.println("Thread name is:"+Thread.currentThread().getName()+i);
		}

	}*/

	
}
class Hello extends Thread
{
	public void run()
	{
		for (int i = 'A';i<'E';i++)
		{
			System.out.println("Thread name is:"+Thread.currentThread().getName()+i);
		}
	}
}

class Multitasking2
{
	public static void main(String arg[]) 
	{
		System.out.println("Main thread name is:"+Thread.currentThread().getName());
		Demo obj1 = new Demo();
		//Demo obj2 = new Demo();
		Hello obj2 = new Hello();
		Thread t1 = new Thread(obj1,"First");
		Thread t2 = new Thread(obj2,"Second");
		t1.start();
		t2.start();
	}
}