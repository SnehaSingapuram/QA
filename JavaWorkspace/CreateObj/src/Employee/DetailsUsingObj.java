package Employee;

import java.util.Scanner;

public class DetailsUsingObj {

	public static void main(String[] args)
	{
		
		Details obj = new Details();	
		DetailsUsingObj  obj1 = new DetailsUsingObj ();
		
		Scanner sc = new Scanner(System.in);
		
		int eno = sc.nextInt();		
	    int  esal = sc.nextInt();	
		String ename =  (sc.next());	
		
		System.out.println("Employee no:" +eno);
		System.out.println("Employee nsal:" +esal);
		System.out.println("Employee ename:" +ename);

		
		
		
	}

}
