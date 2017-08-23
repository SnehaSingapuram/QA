package Example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamAndBufferReader {

	public static void main(String[] args) throws IOException
	{
		InputStreamReader ISRobj = new InputStreamReader(System.in);
		BufferedReader BRobj = new BufferedReader(ISRobj);
		
		System.out.println("Welcome to:");
		String value = BRobj.readLine();
		
		System.out.println("This is : " +value);
		
		ISRobj.close();
		BRobj.close();
		
		
	}

}
