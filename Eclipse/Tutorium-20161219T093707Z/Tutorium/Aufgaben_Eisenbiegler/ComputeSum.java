package Aufgaben_Eisenbiegler;

public class ComputeSum {
	
	public static int numbers[]=
		{
				2,5,6,7,9
		};	
	
	public static void main (String[] args)
	{
		
		int sum = 0;
		for( int i : numbers) { // foreach in c# !!!
		    sum += i; // Add right operant to left operant and
		}

		System.out.println(sum);
		
		arithmeticValue();
	}
	
	public static void arithmeticValue()
	{
		int val = 0;
		for (int i : numbers)
		{
			val += i;			
		}
		
		int aritm = val/numbers.length;
		System.out.println(aritm);
	}

}
