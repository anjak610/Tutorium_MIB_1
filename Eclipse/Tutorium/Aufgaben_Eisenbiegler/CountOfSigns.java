package Aufgaben_Eisenbiegler;
import java.util.ArrayList;

public class CountOfSigns {
	
	
	public static void main (String[] args)
	{
		
	//vorkommen();
	vorkommenNoList();
	
	}
	
	public static void vorkommen()
	{
		String string = "engineering";
		int count = 0;
		ArrayList<Character> c = new ArrayList<Character>();
		
	for(int i =0; i <string.length(); i++)
	{
	    count=0;
	    if(c.contains(string.charAt(i)))
	    {
	        //continue;
	        c.add(string.charAt(i));
	       // System.out.println(c);
	    }   
	   // c.add(string.charAt(i));        
	    for(int j = 0;j<string.length();j++)
	    {
	        if(string.charAt(j) == string.charAt(i))
	        {
	            count++;
	        }
	    }
	   // System.out.println("The number of letter "+string.charAt(i)+" is " + count);
	}
	
	}
	
	public static void vorkommenNoList()
	{
	    String str = "engineering";
	    char [] toCheck = str.toCharArray();
	    int count = 0;	
	    //System.out.println(count);
	    
		for(int i = 0; i< str.length(); i++)
		{
			count= 0;
			//System.out.println(count);
			
			for(char ch : toCheck)
			{	
				count= 0;
				if(ch == toCheck[i])
				{
					//counter++;
					//System.out.println("The number of letter "+toCheck[i]+" is " + count);
				}
				 for(int j = 0;j<str.length();j++)
				    {
				        if(toCheck[j] == toCheck[i])
				        {
				            count++;
				        }
				    }				
			}
			System.out.println("The number of letter "+toCheck[i]+" is " + count);
			
		}
	}
	
}
	
	
	
/*public static void main(String[] args)
	{
				vorkommen();
		
	}
	
	public static void vorkommen()
	{
						
		for(int i = 0; i< toCheck.length; i++)
		{
			for(char ch : toCheck)
			{
				if(ch == toCheck[i])
				{
					counter++;
					System.out.println(toCheck[i]);
				}
			}
			if(str.charAt(i) == 'g')
			{
				counter++;
			}
			
		}
		
	}

}<+7*/