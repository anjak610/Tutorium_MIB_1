package klasuraufgabgen_1;

public class A {

	public static int f (String s, int n)
	{
		if(n ==4)
		{
			return 2*n;
		}
		if(n>14)
			return f(s,11-s.length());
		return n;
	}
	
	public static int g(String s, int n)
	{
		for(int i = 0; i< s.length(); i++)
		{
			if(n ==4)
			{
				return 2*n;
			}
			if(n>14)
			{
				n = 11-s.length();
			}			
		}
		return n;
	}
	
	public static void main (String[] args)
	{
		System.out.println(f("Maus" ,4));
		System.out.println(g("Maus" ,4));
	}
	
}
