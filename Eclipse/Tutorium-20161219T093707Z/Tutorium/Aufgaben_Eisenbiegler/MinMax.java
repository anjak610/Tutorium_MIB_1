package Aufgaben_Eisenbiegler;

public class MinMax {
	
	public static void main (String[] args)
	{
		int num[] = 
			{
					9,6,3,10,0,6,4,-5,7		
			};
		
		int min = num[0];
		int max = num[0];
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i]<min)
			{
				min = num[i];
			}
			if (num[i]> max)
			{
				max = num[i];
			}	
			
			//System.out.println("Max:"+max);
		}
		
		System.out.println("Min:"+min);
		System.out.println("Max:"+max);
	}

}
