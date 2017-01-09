package klasuraufgabgen_1;

public class Aufgabe1 {
	
	public static void main (String[] args)
	{
		int[]a = {1,5,1,8,3};
		int b = 9;
		System.out.print(f(a,b));
	}
	
	public static int f (int[] a, int b)
	{
		for (int i = 0; i< a.length-1; i++ )
		{
			if(a[i] + a[i+1] == b)
			{
				return i;
			}
		}
		return -1;
	}

}
