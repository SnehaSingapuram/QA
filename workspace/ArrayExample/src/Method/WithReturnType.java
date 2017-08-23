package Method;

public class WithReturnType {

	public static void main(String[] args) {
		int variable_value[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		display(variable_value);
			
		int variable_value[] revValue;
		revValue[] = reverseArray(variable_value);
		System.out.println("Reversed Array Elements");
		display(revValue);
		}
public static void display(int variable_value[] input){
	for (int i=0; i<input.length; i++)		
	{
	System.out.println(input[i]);
		
	}
}
public static int variable_value[] reverseArray(int variable_value[] input)
{
	int variable_value reverse = new int variable_value[input.length];
	for (int n=0; m= reverse.length-1; n<input.length; n++; m-- )
	{
		reverse[m]= input[n];
		
	}
return reverse;
		}
}
