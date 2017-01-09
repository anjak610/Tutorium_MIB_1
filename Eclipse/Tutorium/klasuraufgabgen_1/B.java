package klasuraufgabgen_1;

public class B {
	
	public static int x[] = {2,1,0,2,3};
	public static String y[] = {"das" , "18", "Auto", "grün"};
	
	public static void main(String args[])
	{
		try{
			for(int i = 0; i<7; i++)
			{
				System.out.println("i= " +i);
				System.out.println("y[x[i]] = " + y[x[i]]);
				try{
					int z = Integer.parseInt(y[x[i]]);
					System.out.println("z = " + z);
				}
				catch(NumberFormatException e)
				{
					System.out.println("P");
				}
				System.out.println("i*i = " + (i*i));
			}
		}
			catch (Exception e)
			{
				System.out.println("Q");
			}
		}
	
	}



