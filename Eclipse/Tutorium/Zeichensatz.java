
public class Zeichensatz {
	
	public void main (String[]args)
	{
		int a = 0;
		int b = 6;
		zeichenTabelle(a,b);
	}
	
	public static void zeichenTabelle(int a, int b)	
	{
		for(int i = a; i <=b ; i++)
		{
			int x = i;
			System.out.println(x);
			System.out.println((char) x);
		}
			
	}

}
