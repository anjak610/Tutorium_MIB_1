package Aufgabe14_6;

import java.util.ArrayList;
import java.util.List;

public class Primzahlen {


	
	public static void main (String[]args)
	{
		int a = 12;
		int b = 5;
		int c = 2351;
		int d = 100;	
			
		primfaktoren(d);
		System.out.println(teilbar(a,b));
		System.out.println(prim(c));
		
		
	}
	public static boolean teilbar(int a, int b)
	{
		if(a%b == 0)
		{
			return true;
		}
		return false;
	}
	
	public static boolean prim(int c)
	{
		for (int i = 2; i < c; i++)
		{
			if (c%i == 0)
			{
				return false;
			}		
		}
		return true;
	}
	
	public static void primfaktoren(int d)
	{
		List<Integer> Primfaktoren = new ArrayList<Integer>();
		for(int i = 2; i<=d; i++)
		{
			if(d%i == 0)
			{
				Primfaktoren.add(i);
			
				d = d/i;
				
				i = 2;
			}			
		}		
		System.out.println(Primfaktoren);
	}
	
}