import java.lang.*;

class BankAccount
{
	public static double Balance;
	static
	{
		Balance = 1000.00;
	}
}
class Withdraw extends Thread
{
	private double Amount;
	public Withdraw(double Amount)
	{
		this.Amount = Amount;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
			BankAccount.Balance = BankAccount.Balance - Amount;
			System.out.println("Balance amount after Withdraw:"+BankAccount.Balance);
		}
		catch(Exception obj)
		{}

	}
}

class Deposit extends Thread
{
	private double Amount;
	public Deposit(double Amount)
	{
		this.Amount = Amount;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		try
		{
			Thread.sleep(5000);
			BankAccount.Balance = BankAccount.Balance + Amount;
			System.out.println("Balance amount after Deposit:"+BankAccount.Balance);
		}
		catch(Exception obj)
		{}
	}	
}
class Multitasking4
{
	public static void main(String arg[])throws Exception
	{
		System.out.println("Balance amount is:"+BankAccount.Balance);
		
		Withdraw wobj = new Withdraw(200);
		Deposit dobj = new Deposit(300);

		//Withdraw wobj1 = new Withdraw(300);
		//Deposit dobj2 = new Deposit(400);
		
		Thread t1 = new Thread(wobj,"t1");
		Thread t2 = new Thread(dobj,"t2");

		//Thread t3 = new Thread(wobj1,"t3");
		//Thread t4 = new Thread(dobj2,"t4");

		t1.start();
		t2.start();
		//t3.start();
		//t4.start();

		t1.join();
		t2.join();
		//t3.join();
		//t4.join();

		System.out.println("Balance amount is:"+BankAccount.Balance);	
	}
}