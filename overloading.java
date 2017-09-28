package methodoverloading;

public class overloading {
	void m1()
	{
		System.out.println("zero avg");
	}
	class overloaded extends overloading
	{
	void m1(int x)
	{
	System.out.println("int arg");
	}
	
	}
			overloaded ol=new overloaded();
			}
			




