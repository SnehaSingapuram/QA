package Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterStringValues {

	public static void main(String[] args) throws IOException 
	{
		InputStreamReader obj1 = new InputStreamReader(System.in);
		BufferedReader obj2 = new BufferedReader(obj1);
		
		System.out.println("What is your name: ");
		String userInput = obj2.readLine();
		
		System.out.println("My name is " +userInput);
		
		obj1.close();
		obj2.close();
		
	}

}
