package Example;

public class HandleException
{
public static int retInt()
{
	int a = 100;
	try {
		return a;
	}
	catch (ArithmeticException e)
	{
		
		System.out.println("catch called");
		System.out.println(e);
		return a;
		
	}
	finally
	{
		System.out.println("finally called");	
	}
	
}
	public static void main(String[] args)
	{	
System.out.println(retInt());
	}

}
