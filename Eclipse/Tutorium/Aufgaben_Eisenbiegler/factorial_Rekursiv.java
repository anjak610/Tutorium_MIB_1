package Aufgaben_Eisenbiegler;

public class factorial_Rekursiv {
	
	public static void main (String[]args)
	{
		int n = 5;
		System.out.println(factorial(n));
	}
	
	public static int factorial (int n) {
	    if (n == 1 || n ==1) {
	        return 1;
	    } else {
	        return n*factorial(n-1);
	    }
	}

}
