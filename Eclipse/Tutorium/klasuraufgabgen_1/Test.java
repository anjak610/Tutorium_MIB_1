package klasuraufgabgen_1;

public class Test {
	
	public int a ; 
	private String b;
	public Test c; 
	
	public Test (int q)
	{
		a = q;
		b= true;
		c= null;
		return a;
	}
	
	public boolean f (int r)
	{
		int p = 4;
		p = 7;
		q= p+3;
		
	}
	
	public static int g (int r)
	{
		if(f(r))
		{
			r = g(r+1);
			return r*a+3;
		}
	
	}
	
	public static void main (String args[])
	{
		//Test c = new Test();
		//c.f(4);
		System.out.println(f(6));
		//System.out.println(c.f(4));
		System.out.println(g(3));
		Test t1 = new Test (5);
		Test t2 = new Test(7);
		
		t1.c = t2;
		t2.c = t1;
		
		for (int i = 0; i<10;i++)
		{
			if(i*i+2)
			{
				t1.f(g(i,2));
				System.out.println(t1.a);
			}
		}
	}

}