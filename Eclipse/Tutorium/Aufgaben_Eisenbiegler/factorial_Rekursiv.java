package Aufgaben_Eisenbiegler;

public class factorial_Rekursiv {
	
	public static void main (String[]args)
	{
		int n = 5;
		System.out.println(factorial(n));
		//factorial(n);
	}
	
	public static int factorial (int n) {
	    if (n == 0 || n ==1) {
	        return 1;
	    } else {
	    	//System.out.println(n);
	        return n*factorial(n-1);
	    }
	}

}
