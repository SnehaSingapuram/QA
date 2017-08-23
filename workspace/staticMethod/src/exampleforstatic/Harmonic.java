package exampleforstatic;

public class Harmonic {
	
	public static double Harmonic(int n)
	{
		double sum = 0.0;
		for(int i = 1; i<=n; i++ )
		{
		sum += 1.0/i;
		}
	return(sum);
	}
	public static void main(String[] args) 
	{
	for (int i=0; i< args.length; i++)
	{
		int arg = Integer.parseInt(args[i]);
		double value = Harmonic(arg);
		System.out.println(value);
		
	}

	}

}
