package Examples.ObjectMethods;

public class Test {
	
	
	public static void main(String[]args)
	{		
		
		Blueprint h1 = new Blueprint(); 
		Blueprint h2 = new Blueprint();
		
		Blueprint h3 = new Blueprint("blue", 2, 3); 
	
		
		h1.color = "red"; // Hier alles anzugeben ist ja ziemlich doof --> hierf�r gibt es Konstruktoren
		h1.floors = 3;
				
		// Instanz Variabeln
		System.out.println("I want a " + h1.color + " house with " +h1.floors+ " floors");
		//System.out.println("I want a " + h2.color + " house with " +h2.floors+ " floors");		
		// Instanz Methoden
		h1.add();
		System.out.println("I want a " + h1.color + " house with " +h1.floors+ " floors");
		
		h1.add(5);
		System.out.println("I want a " + h1.color + " house with " +h1.floors+ " floors");
		
		h1.repaint("green");
		System.out.println("I want to repaint my house to " + h1.color );		
		
		System.out.println("I want a " + h3.color + " house with " +h3.floors+ " floors and " + h3.rooms +" rooms");
		
		
	}

}
