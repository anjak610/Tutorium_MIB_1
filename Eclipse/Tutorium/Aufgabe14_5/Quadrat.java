package Aufgabe14_5;

public class Quadrat {

	public static String result = "";
	public static String star = "";

	public static void main(String[] args) {

		int k = 8;
		quadrate(k);
		//System.out.print("\n" +star);
	}

	private static void quadrate(int k) {
		
		//for schleife schreiben, zu doof f�r rekursion......
		if (k > 0) { //(k > 0) 
			System.out.print("*");		
			if(k-1>1)
			{
				result += "-";
			}	
			star += "*";		
				
			quadrate(k - 1);
			
			if (k-1 > 1) {
				System.out.print("\n" + "*" + result + "*");			
			}
			
				
		}	
		
		
		
		/*if(k == 0)
		{
			System.out.print("\n" + "*" + result + "*" + "\n" +star);
		}*/
		
	}
	
}