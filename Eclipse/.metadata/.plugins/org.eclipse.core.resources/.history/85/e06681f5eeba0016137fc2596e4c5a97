package Aufgaben_Eisenbiegler;

public class Iterative_Fibonacci {

	public static void main(String[] args) {
		int n = 5;
			
		fibonacci(n);
	}

	
	public static void fibonacci(int y)
	{
	    int[] a = new int[y+1];
	    a[0] = 0;
	    a[1] = 1;
	    System.out.println("Step 0: 0");
	    System.out.println("Step 1: 1");
	    for(int i=2; i<=y; i++){
	        a[i] = a[i-1] + a[i-2];
	        System.out.println("Step "+i+": "+a[i]);
	    }
	    System.out.println("Array size --> "+a.length);
	}

}
