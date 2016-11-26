package Aufgaben_Eisenbiegler;

public class FindSubstring {
	
	public static void main (String[] args)
	{		
		substring();
	}
	
	public static void substring()
	{
		
		String A = "Hustensaft";
		String B = "saft";
		int pos = 0;
		
		if(A.contains(B))
		{
			System.out.println("B is in A");			
			//char [] lettersA = A.toCharArray();
			//char [] lettersB = B.toCharArray();		
			
			int index = A.indexOf(B);
			System.out.println(index);		
		}
		else 
		{
			System.out.println("B is NOT in A");
			int index = -1;
			System.out.println(index);
		}
		
	}

}
