package Aufgaben_Eisenbiegler;

public class Rekursion_Fibonacci {
	
	
	public static void main (String[] args)
	{
	
		int x = 5;
		System.out.println(fibonacci(x));
	}
	
	public static int fibonacci (int n)
	{
		if(n == 0)
		{
			return 0;
		}
		
		if(n == 1)
		{
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
