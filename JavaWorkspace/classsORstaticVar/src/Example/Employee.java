package Example;

public class Employee {

	//Declaring variable salary as private static 
	private static double salary;
	
	//Declaring Department variable as public static
	public static final String Department= "Development ";
	
	public static void main(String[] args) {
	salary = 1000;
	System.out.println(Department + "average salary " +salary);

	}

}
