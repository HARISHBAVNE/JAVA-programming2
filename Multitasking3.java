import java.lang.*;

class Demo extends Thread
{
	public void run()
	{
		task1();
		task2();
	}
	public void task1()
	{
		System.out.println("inside task 1.");
		for (int i=1;i<27;i++)
		{
			System.out.println("Thread name is:"+Thread.currentThread().getName()+i);
		}
	}
	public void task2()
	{
		System.out.println("inside task 2.");
		for (int i = 'A';i<'Z';i++)
		{
			System.out.println("Thread name is:"+Thread.currentThread().getName()+i);
		}
	}
}

	

class Multitasking3
{
	public static void main(String arg[]) 
	{
		Demo obj = new Demo();
		Thread t1 = new Thread(obj);
		t1.start();	
	}
}