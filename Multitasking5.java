import java.lang.*;

class Reservation extends Thread
{
	public static int  Available;
	static
	{
		Available = 1;
	}
	public int Want;
	public Reservation(int Seat)
	{
		Want = Seat;
	}
	synchronized public void run()
	{
		if (Available >= Want)
		{
			Available = Available - Want;
			System.out.println("Available seats:"+Available);
			System.out.println("Booking confirmed "+"for "+Thread.currentThread().getName());
			
			try
			{
				Thread.sleep(1500);
				System.out.println("Available seats are:"+Available);
			}
			catch(Exception obj){}
		}
		else
		{
			System.out.println("No Seats are Available.");
		}
	}
}

class Multitasking5
{
	public static void main(String arg[])throws Exception
	{
		Reservation obj1 = new Reservation(1);
		Reservation obj2 = new Reservation(1);

		Thread t1 = new Thread(obj1,"P1");
		Thread t2 = new Thread(obj2,"P2");

		t1.start();
		t2.start();
	}
}