package Aufgabe_10;

public class Abstract_test {	
	
	
	public static void main (String[]args)
	{
		QuadratischeFunktion findNull = new QuadratischeFunktion(6 ,5, 4);
		
		findNull.nullstelle(-1, 10, 0.001);
		
		System.out.println(findNull.nullstelle(-1, 10, 0.001));
		
	}

}
