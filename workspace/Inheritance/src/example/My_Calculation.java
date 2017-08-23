package example;

// Parent Class
class calculation
{
	int z;
	public void addition(int x, int y)
	{
	z = 	x+y;
	System.out.println("The addition value is: "+z);
	}
	
	public void subtraction(int x, int y)
	{
		z = x-y;
	System.out.println("The subtraction value is: "+z);
	}
	
}

public class My_Calculation extends calculation
{
	
	//Child Class
public void multiplication(int x, int y)
{
	z = x*y;

	System.out.println("The multiplication value is:  "+z);

}

	public static void main(String[] args) 
	{
	int a  = 10;
int b  = 20;
		My_Calculation obj = new My_Calculation();
		
		obj.addition(a, b);
        obj.subtraction(a, b);
        obj.multiplication(a, b);
        
	}

}
