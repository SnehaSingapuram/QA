package Parameters;

public class Example {

	public static void main(String[] args)
	{
		
		//passing parameters with method1
	welcome("Sneha");	
	welcome( "Anvesh");	
	
// parameters with method2
	Add(20,8);
	 Add(100,200);
	
	
	//parameters with method3
	add(10,20,30);
	int value = add(10,20,30);
	System.out.println("value:" +value);
	}
	//method1 with type void
public static void welcome(String name)
{
	System.out.println("name:" +name);
}
//method2 with type void
public static void Add(int a, int b)
{
	int c;
	c = a+b;
	//System.out.println("Value:"  +c);
	System.out.println(a+b);
	
}

//Method3 with return type
public static int add(int a, int b, int c)
{
	int d;
	d = a+b+c;
	return(d);
	
}
}