package example;

class methodOverload
{
	int height;
	
methodOverload()
{
	System.out.println("bricks");
	height = 0;
}

methodOverload(int i)
{
	System.out.println("Building a new house that is: " +i+ "feel tall");
	height = i;
}
void info()
{
	System.out.println("House is " + height +  "feet tall");
}
void info(String s)
{
	System.out.println(s + ": House is " + height + "feet tall");
	
}
public class MainCLass {

	public void main(String[] args)
	{
		
methodOverload obj = new methodOverload(0);
obj.info();
obj.info("overloaded method");

new methodOverload();
	}
	}

}
