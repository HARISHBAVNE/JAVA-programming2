import java.lang.*;

class Demo
{
	public int i,j;
	public Demo(int a,int b)
	{
		System.out.println("Inside Constructor");
		i = a;
		j = b;
	}
	public Demo()
	{
		this(10,20);		//1
		System.out.println("Inside default Constructor");
	}
	static
	{
		System.out.println("static block.");
	}
	{
		System.out.println("Initialization block.");
	}
	public void fun()
	{
		System.out.println("Inside fun");
		System.out.println("Value of i:"+this.i);
		System.out.println("Value of j:"+this.j);	
	}
	public void gun()
	{
		System.out.println("Inside gun");
		this.fun();	
	}

}
class This
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		obj.gun();
	} 
}