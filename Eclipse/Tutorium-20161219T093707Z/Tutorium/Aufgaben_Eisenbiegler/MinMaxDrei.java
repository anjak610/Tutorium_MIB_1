package Aufgaben_Eisenbiegler;


public class MinMaxDrei {

	
	public static void main(String[] args)
	{
		 /*for(int i = 0; i < args.length; i++) {
	            System.out.println(args[i]);
		 }*/
		
		int num[] = 
			{
					0,1,2		
			};
		
		System.out.print(num[0]);
		 
		//System.out.println("num[0]:"+ num[0] +"\n"+ "num[1]:"+num[1] +"\n"+"num[2]:"+num[2]);
		
		// Get Min
		if(num[0] < num[1] && num[0]< num[2])
		{
			//System.out.printf("num[0] is Min: %s",num[0] +"\n");
		}
		else if (num[1] < num[0] && num[1]< num[2])
		{
			//System.out.printf("num[1]is Min: %s",num[1] +"\n");
		}
		else if (num[2]< num[1] && num[2] < num[0])
		{
			//System.out.printf("num[2] is Min: %s",num[2] +"\n");
		}
		
		//Get Max
		
		if(num[0] > num[1] && num[0]> num[2])
		{
			//System.out.printf("x is Max: %s",num[0] +"\n");
		}
		else if (num[1] > num[0] && num[1]> num[2])
		{
			//System.out.printf("num[1] is Max: %s",num[1] +"\n");
		}
		else if (num[2] > num[1] && num[2] > num[0])
		{
			//System.out.printf("num[2] is Max: %s",num[2] +"\n");
		}
		
		//System.out.print(num.length);
	}
 
 

}


