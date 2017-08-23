package example;

public class Employee {

	//This instance variable is visible inside any child class 
	public String name;
	
	//Salary variable is visible only in Employee class only
	private static double salary;
	private static int ID;
	
	//The Name variable is assigned in the constructor
	public Employee(String empName)
	{
		name = empName;
	}
	
	//The salary variable and ID variable is assigned to value
	public static void setDetails(double empSal, int empID)
	{
		salary = empSal;
		ID = empID;
	}
	public void printEmp()
	{
		System.out.println("Employee Name is " +name);
		System.out.println("Employee salary is " +salary);
		System.out.println("Employee ID is " +ID);
	}
	public static void main(String[] args) 
	{
	Employee empOne = new Employee("Sneha");
	empOne.setDetails(1000, 1);
	empOne.printEmp();

	}

}
