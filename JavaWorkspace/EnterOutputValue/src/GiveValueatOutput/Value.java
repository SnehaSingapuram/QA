package GiveValueatOutput;

import java.util.Scanner;

public class Value { 

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the input values of a and b: ");
		
		int a = Integer.parseInt(obj.nextLine());
		int b = Integer.parseInt(obj.nextLine());
		
		int c = a+b;
		System.out.println(" The output value is: " +c);
		
	}

}
