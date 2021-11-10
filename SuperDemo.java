import java.lang.*;
class Base
{
	public int i;
	public Base()
	{
		System.out.println("Default Base constructor");
	}
	public Base(int no)
	{
		System.out.println("Parametrised Base constructor");
		this.i = no;
	}
	public void fun()
	{
		System.out.println("Inside Base fun");
	}
}
class Derived extends Base
{
	public int j;
	public Derived(int no)
	{
		super(10);
		System.out.println("Parameterised Derived constructor");
		j = no;
	}
	public void gun()
	{
		System.out.println("Inside Derived gun");
		System.out.println("j="+this.j);
		System.out.println("i="+super.i);
		super.fun();
	}
	

}
class SuperDemo
{
	public static void main(String arg[])
	{
		Derived obj = new Derived(20);
		obj.gun();
	} 
}