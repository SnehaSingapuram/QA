package Example;

import java.util.Scanner;

public class PrintDiffTypesValues 
{

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter value a:");
		int a = obj.nextInt();
		
		System.out.println("Enter value b:");
		double b = obj.nextDouble();
		
		System.out.println("Enter value c:");
		String c = obj.next();
		
System.out.println("Value of a:" +a);
System.out.println("Value of b:" +b);
System.out.println("Value of c:" +c);

	}

}
