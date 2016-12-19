package Examples;

public class ReturnValues {
	
	public static void main (String[]args)
	{
		int x = 9;
		int y = 3;
		add(x,y);
		
		int z = add2(x,y);
		System.out.println(z);
		
		x= x+ 7; 
		System.out.println(x);
		
	}
	
	public static void add(int x, int y) 
	{
		int z = x+y;
		System.out.println(z);		
	}
		
	
	public static int add2 (int x, int y)
	{
		int z = x+y;
		return z; 
	}
}
